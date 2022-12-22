        package Lesson12aInterfacePolymorphism;
        public class App {
            public static void main(String[] args) {
// 6)
                String xx = "I'm string";
                System.out.println(xx.charAt(0));
                // GO TO --------> IBulbE27

// 11)
                IAmericanElectricalPlug printer = new MyPrinter("My", "My");
                IAmericanElectricalPlug dd = new MyDesktopLight();

// 12)
                IAmericanElectricalPlug[] plugs = {printer, dd};
                for (IAmericanElectricalPlug plug : plugs) {
                    plug.americanPlug();
                    //объект типа интерфейс создавать нельзя, почему потому что там абстрактные
                    //методы. вы не можете создать объект у которого есть абстрактные методы
                }
            }
        }
        // THE END

