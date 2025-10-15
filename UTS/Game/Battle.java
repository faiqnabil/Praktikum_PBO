import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Battle {
    private final List<Character> teamA;
    private final List<Character> teamB;
    private final List<Character> allCharacters;
    private int turn = 0;

    public Battle(List<Character> teamA, List<Character> teamB) {
        this.teamA = new ArrayList<>(teamA);
        this.teamB = new ArrayList<>(teamB);
        this.allCharacters = new ArrayList<>();
        this.allCharacters.addAll(teamA);
        this.allCharacters.addAll(teamB);
    }
    
    private boolean isTeamDefeated(List<Character> team) {
        return team.stream().noneMatch(Character::isAlive);
    }

    private Character autoTarget(Character attacker, List<Character> targetTeam) {
        List<Character> aliveTargets = targetTeam.stream()
            .filter(Character::isAlive)
            .collect(Collectors.toList());

        if (aliveTargets.isEmpty()) {
            return null;
        }

        if (attacker instanceof Enemy) {
            List<Character> alivePlayers = aliveTargets.stream()
                .filter(c -> c instanceof Player)
                .collect(Collectors.toList());
            
            if (!alivePlayers.isEmpty()) {
                return alivePlayers.stream()
                    .max((c1, c2) -> Integer.compare(c1.getHealth(), c2.getHealth()))
                    .orElse(null);
            } else {
                return aliveTargets.get(new Random().nextInt(aliveTargets.size()));
            }
        } else if (attacker instanceof Player) {
            List<Enemy> aliveEnemies = aliveTargets.stream()
                .filter(c -> c instanceof Enemy)
                .map(c -> (Enemy) c)
                .collect(Collectors.toList());
            
            if (!aliveEnemies.isEmpty()) {
                return aliveEnemies.stream()
                    .max((e1, e2) -> {
                        int threatCompare = Integer.compare(e1.getThreatLevel(), e2.getThreatLevel());
                        if (threatCompare != 0) {
                            return threatCompare; 
                        }
                        return Integer.compare(e2.getHealth(), e1.getHealth()); 
                    })
                    .orElse(null);
            } else {
                return aliveTargets.get(new Random().nextInt(aliveTargets.size()));
            }
        }
        
        return aliveTargets.get(new Random().nextInt(aliveTargets.size())); 
    }

    public void run() {
        System.out.println("\n=======================================");
        System.out.println("     SIMULASI PERTARUNGAN DIMULAI");
        System.out.println("=========================================\n");
        
        printTeamStatus();
        
        while (!isTeamDefeated(teamA) && !isTeamDefeated(teamB)) {
            turn++;
            System.out.println("\n===============================================");
            System.out.println("              GILIRAN " + turn);
            System.out.println("===============================================\n");

            List<Character> currentTurnOrder = new ArrayList<>(allCharacters);
            List<Character> aliveCharacters = currentTurnOrder.stream()
                .filter(Character::isAlive)
                .collect(Collectors.toList());
            
            for (Character attacker : aliveCharacters) {
                List<Character> targetTeam = teamA.contains(attacker) ? teamB : teamA;
                
                if (isTeamDefeated(targetTeam)) break; 
                
                Character target = autoTarget(attacker, targetTeam);

                if (target != null) {
                    attacker.performTurn(target);
                    System.out.println(); 
                }
            }
            
            if (isTeamDefeated(teamA) || isTeamDefeated(teamB)) {
                break;
            }
        }

        System.out.println("\n=======================================");
        System.out.println("         PERTARUNGAN SELESAI");
        System.out.println("=========================================\n");
        
        if (isTeamDefeated(teamA)) {
            System.out.println(">>> PEMENANG: TIM B (Enemy) <<<\n");
        } else if (isTeamDefeated(teamB)) {
            System.out.println(">>> PEMENANG: TIM A (Player) <<<\n");
        } else {
            System.out.println("Pertarungan berakhir tanpa pemenang.\n");
        }
        
        printFinalStats();
    }
    
    private void printTeamStatus() {
        System.out.println("TIM A (Players):");
        teamA.forEach(c -> {
            System.out.printf("  - %-15s | HP: %3d/%3d\n", 
                c.getName(), c.getHealth(), c.getMaxHealth());
        });
        
        System.out.println("\nTIM B (Enemies):");
        teamB.forEach(c -> {
            System.out.printf("  - %-15s | HP: %3d/%3d\n", 
                c.getName(), c.getHealth(), c.getMaxHealth());
        });
        System.out.println();
    }
    
    private void printFinalStats() {
        System.out.println("=====================================");
        System.out.println("          STATISTIK AKHIR");
        System.out.println("=====================================\n");
        
        System.out.println("TIM A (Players):");
        teamA.forEach(c -> {
            String status = c.isAlive() ? "[HIDUP]" : "[GUGUR]";
            System.out.printf("  - %-15s | HP: %3d/%3d | %s\n", 
                c.getName(), c.getHealth(), c.getMaxHealth(), status);
        });
        
        System.out.println("\nTIM B (Enemies):");
        teamB.forEach(c -> {
            String status = c.isAlive() ? "[HIDUP]" : "[GUGUR]";
            System.out.printf("  - %-15s | HP: %3d/%3d | %s\n", 
                c.getName(), c.getHealth(), c.getMaxHealth(), status);
        });
        
        System.out.println("\n===============================================\n");
    }
}