public class Attack {
    int playerAtk;
    int monsterAtk;
    int playerHp;
    int monsterHp;
    int remainingHp;
    void attack() {

        Player player = new Player();
        Monster monster = new Monster();

        playerHp = player.getPhp();
        monsterHp = monster.getMhp();
        monsterAtk = monster.getMatk();
        while (playerHp>0&&monsterHp>0) {
            playerAtk = player.getPatk();
            playerHp -= monsterAtk;
            monsterHp -= playerAtk;
            if (playerHp>0&&monsterHp>0) {
                System.out.println("Player hit monster " + playerAtk + " damage, monster remaining " + monsterHp + " HP");
                System.out.println("Monster hit player " + monsterAtk + " damage, player remaining " + playerHp + " HP");
                System.out.println("-----------------");
            }else if(playerHp<=0 && monsterHp>0){
                System.out.println("Monster hit player " + monsterAtk + " damage, Player died!");
            }else if (playerHp>0 && monsterHp<=0){
                System.out.println("Player hit monster " + playerAtk + " damage, Monster died!");
            }
        }
    }
    public int getRemainingHp(){
        return playerHp;
    }

    public void setRemainingHp(int remainingHp) {
        this.remainingHp = remainingHp;
    }
}
