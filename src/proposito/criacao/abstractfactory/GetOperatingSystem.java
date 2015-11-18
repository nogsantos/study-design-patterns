package proposito.criacao.abstractfactory;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Nov 18, 2015
 */
public class GetOperatingSystem {

    private static final GetOperatingSystem INSTANCE = new GetOperatingSystem();
    
    private static String OS = System.getProperty("os.name").toLowerCase();
    
    private GetOperatingSystem(){}
    
    public static GetOperatingSystem getInstance(){
        return INSTANCE;
    }

    public String getSo() {
        System.out.println(OS);
//        if (isWindows()) {
//            System.out.println("This is Windows");
//        } else if (isMac()) {
//            System.out.println("This is Mac");
//        } else if (isUnix()) {
//            System.out.println("This is Unix or Linux");
//        } else if (isSolaris()) {
//            System.out.println("This is Solaris");
//        } else {
//            System.out.println("Your OS is not support!!");
//        }
        return OS;
    }
    private static boolean isWindows() {
        return OS.contains("win");
    }
    private static boolean isMac() {
        return OS.contains("mac");
    }
    private static boolean isUnix() {
        return OS.contains("nix") || OS.contains("nux") || OS.indexOf("aix") > 0;
    }
    private static boolean isSolaris() {
        return (OS.contains("sunos"));
    }
}
