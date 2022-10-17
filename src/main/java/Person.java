public class Person {

        private String name;
        private int age;
        private String hairColor;
        private boolean hasKids;
        private double height;
        private char sex;
        private String homeState;

        public String getHairColor() {
            return hairColor;
        }

        public void setHairColor(String hairColor) {
            this.hairColor = hairColor;
        }

        public boolean isHasKids() {
            return hasKids;
        }

        public void setHasKids(boolean hasKids) {
            this.hasKids = hasKids;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public char getSex() {
            return sex;
        }

        public void setSex(char sex) {
            this.sex = sex;
        }

        public String getHomeState() {
            return homeState;
        }

        public void setHomeState(String homeState) {
            this.homeState = homeState;
        }

        public Person() {

        }

        public Person(int age) {
            this.age = age;
        }

        public Person(String name) {
            this.name = name;
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }
    }


