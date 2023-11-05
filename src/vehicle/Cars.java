package vehicle;

public class Cars extends  Vehicle{
        private  int doors ;
        public int getDoors(){
         return  doors;

        }

    @Override
    public void setDoors(int doors) {
        this.doors = doors;
    }
}
