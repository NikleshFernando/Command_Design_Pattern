public class LightOnCommand implements Command{

    private Light Light;

    LightOnCommand(Light Light){
        this.Light = Light;
    }
    public void execute(){

        Light.on();
    }
}
