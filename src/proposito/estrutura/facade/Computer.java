
package proposito.estrutura.facade;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 * 
 * Interface unificada na FAÇADE
 */
public class Computer {
    
    private final long BOOT_ADDRESS = 0;
    private final long BOOT_SECTOR  = 0;
    private final int  SECTOR_SIZE  = 0;

    private Cpu cpu            = null;
    private Memory memory      = null;
    private HardDrive harDrive = null;

    public Computer() {
        this.cpu      = new Cpu();
        this.memory   = new Memory();
        this.harDrive = new HardDrive();
    }
    
    public void startComputer(){
        cpu.freeze();
        memory.load(BOOT_ADDRESS, harDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.execute();
    }
    
}
