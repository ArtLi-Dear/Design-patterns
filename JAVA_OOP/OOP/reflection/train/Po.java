package OOP.reflection.train;

public class Po {

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String name;

        public Po(){}

        public Po(String name) {
            this.name = name;
        }
        public void  eat(){
            System.out.println("吃饭");
        }

}
