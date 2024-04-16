package section6.command;

public class RemoteLoaderForMacro {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        TVOnCommand tvOn = new TVOnCommand(tv);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn };
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        remoteControl.setCommand(0, partyOnMacro, new NoCommand());

        // TODO partyOffMacro 追加

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPushed(0);
    }
}
