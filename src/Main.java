// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

        class Person {
            private String name;
            private int age;

            public String getName()
            {
                return name;
            }

            public void setName(String name)
            {
                this.name = name;
            }

            public int getAge()
            {
                return age;
            }

            public void setAge(int age)
            {
                this.age = age;
            }
        }

        public class Main {
            public static void main(String[] args)
            {
                Person person = new Person();
                person.setName("Suma");
                person.setAge(23);

                System.out.println("Name: " + person.getName());
                System.out.println("Age: " + person.getAge());
            }
        }


