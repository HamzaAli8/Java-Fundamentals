package Hamza;

public class enums {

    enum PizzaStatus {ORDERED, MAKING, READY, DELIVERED
        //ADD THE STATUSES
    }


    class Pizza{
        private PizzaStatus status;

        public boolean isDeliverable() {

            return this.status == PizzaStatus.READY;
        }


        public void setStatus(PizzaStatus status){
            this.status = status;
        }

        public PizzaStatus getStatus(){
            return this.status;
        }
    }

}
