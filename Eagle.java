public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.println(!this.flying);
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s a décollé .%n", this.getName());
        }


    }

    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 325);
            System.out.println(this.getName() + " vole " + this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void glide() {
        System.out.println("glides into the airrrrrr");
    }

    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 1);
            System.out.println(this.getName() + " vole a " + this.altitude);


        }
        return this.altitude;
    }

    @Override
    public void land (){
        if(this.flying && this.altitude == 1){
            System.out.println("l'aigle a attéri");
        } else {
            System.out.println("l'aigle est trop haut pour attérire");
        }
    }
}
