public class Driver {
    public static void main(String[] args){

        Queue<Game> queue = new Queue<Game>();
        Game game1 = new Game("Mario", 50);
        Game game2 = new Game("Sonic", 60);
        Game game3 = new Game("MK", 70);
        //
        Game game4 = new Game("Apex Legends", 0);
        Game game5 = new Game("Call of Duty: Golden package", 80);
        Game game6 = new Game("Star Wars", 55);
        Game game7 = new Game("Among US", 5);
        Game game8 = new Game("Genshin Impact", 0);
        Game game9 = new Game("Red Dead Redemption", 40);
        Game game10 = new Game("Dead SPace", 25);
        Game game11 = new Game("Overwatch 2", 0);
        Game game12 = new Game("Saints Row", 30);
        Game game13 = new Game("Minecraft", 25);

        queue.add(game1);
        queue.add(game2);
        queue.add(game3);
        queue.add(game4);
        queue.add(game5);
        queue.add(game6);
        queue.add(game7);
        queue.add(game8);
        queue.add(game9);
        queue.add(game10);
        queue.add(game11);
        queue.add(game12);
        queue.add(game13);

        print("EMpty? - " + queue.isEmpty());
        print("size? - " + queue.size());
        print("peek? - " + queue.peek());
        print("contains Apex? - " + queue.contains(game4));
        print("");
        print("poll " + queue.poll());
        print("");
        print("peek again? - " + queue.peek());
        print("size? - "  + queue.size());
        print("");
        print("poll " + queue.poll());
        print("");
        print("poll " + queue.poll());
        print("");
        print("poll " + queue.poll());
        print("");
        print("poll " + queue.poll());
        print("");
        print("poll " + queue.poll());
        print("");
        print("poll " + queue.poll());
        print("");
        print("poll " + queue.poll());
        print("");
        print("poll " + queue.poll());
        print("");
        print("poll " + queue.poll());
        print("");
        print("poll " + queue.poll());
        print("");
        print("poll " + queue.poll());
        print("");
        print("poll " + queue.poll());
        print("");
        print("poll " + queue.poll());
        //assk if theres a shorter way to poll
    }
    //ez print
        public static void print(String s) {
            System.out.println(s);
        }
}
