package OOPsBasics;


public class Inheritance {

    public static void main(String[] args) {



    }
    interface interface1{
        public void call();
        public void bolo();
    }
     static class Vehicle extends AbstractClass implements  interface1{
        final int tyres;
        String horn;
        private static int count;



        Vehicle(int tyres){
            this.tyres=tyres;
            System.out.println("Vehicle constructor called");
            count++;
        }

        void print(){
            System.out.println("Vehicle print:"+" tyres:"+tyres+ " horn:" + horn);
        }

        public int getCount(){
            return  count;
        }


         @Override
         public void makeSomeNoise() {

         }

         @Override
         public void dobaramakeSomeNoise() {

         }

         @Override
         public void call() {

         }

         @Override
         public void bolo() {

         }
     }

     static class Car extends Vehicle{
        Car(){
            super(4);
        }
        private int speed=120;
        private int seats=4;

       public void printCar(){

            System.out.println("Car print:"+" speed:"+this.speed+ " seats:" + this.seats);
       }



    }

     static class BMW  extends Car{

        int serviceCost;
        int warranty;
    }


}
