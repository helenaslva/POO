public class Main {
    public static void main(String[] args) {
   Fighter[] fighter = new Fighter[6];

   fighter[0] = new Fighter("Pretty boy", "France", 31, 1.75, 68.9, 11, 3, 1);
   fighter[1] = new Fighter("Putscript", "Brazil", 29, 1.68, 57.8, 14, 2, 3);
   fighter[2] = new Fighter("Snapshadow", "USA", 35, 1.65, 80.9, 12, 2, 1);
   fighter[3] = new Fighter("Dead Code", "Autralia", 28, 1.93, 81.6, 13, 0, 2);
   fighter[4] = new Fighter("UFOCobol", "Brazil", 37, 1.70, 119.3, 5, 4, 3);
   fighter[5] = new Fighter("Nerdaart", "USA", 30, 1.81, 105.7, 12, 2, 4);

   Fight firstFight = new Fight();
   firstFight.markFight(fighter[2], fighter[3]);
   firstFight.fight();
   fighter[2].status();
   fighter[3].status();

   Fight secondFight = new Fight();
   secondFight.markFight(fighter[4], fighter[1]);
    }
}