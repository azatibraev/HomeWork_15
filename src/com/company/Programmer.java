package com.company;


    public class Programmer  extends Person {

        private String companyName;

        public Programmer(String name, String designation, String companyName) {
            super(name, designation);
            this.companyName = companyName;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public void coding() {
            System.out.println( getName() +" is coding on Java");
        }

        @Override
        public void learn() {
            super.learn();
            System.out.println("also PHP");
        }

        @Override
        public void walk() {
            super.walk();
            System.out.println(" on Silicon Valley");
        }

        @Override
        public void eat() {
            super.eat();
            System.out.println(" an Apple");
        }

        @Override
        public String toString() {
            return super.toString() + "\nCompany Name: " + companyName;
        }
}
