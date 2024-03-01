public class LightOffCommand implements Command {

    private Light Light;

     LightOffCommand(Light light){
         this.Light = light;
     }
    public void execute(){
         Light.off();

    }
}
