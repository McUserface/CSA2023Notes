class Client {
    public static int num = 8;
    public static void main(String[] args) {
        Bigfoot footy = new Bigfoot();
        footy.increasePop(78);

        double r = 6.7;
        double circumference = circ(r);

        int randy = (int)(Math.random()*3)+1;
        int x = 8;
        int y = 10;
        int z = 11;

        int min1 = Math.min(x,y);
        int trueMin = Math.min(min1, z);

        int nested = Math.max(Math.max(x,y),z);

        int w = Math.pow(5,2);
        int y = 5*5;




    }
        public static double circ(double radius){
            return 2 * Math.PI * radius;
        }
    }
// see class structure with alt + 7