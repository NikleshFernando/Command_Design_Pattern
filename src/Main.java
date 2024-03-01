// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new LivingRoomLight();
        Light kitchenLight = new KitchenLight();

        Command LightOnCommand = new LightOnCommand(livingRoomLight);
        LightOnCommand.execute();

        Command LightOffCommand = new LightOffCommand(livingRoomLight);
        LightOffCommand.execute();

        Command LightOnCommand1 = new LightOnCommand(kitchenLight);
        LightOnCommand1.execute();
        Command LightOffCommand1 = new LightOffCommand(kitchenLight);
        LightOffCommand1.execute();
    }

}