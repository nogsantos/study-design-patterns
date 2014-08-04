
package proposito.estrutura.facade;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 */
public class HardDrive {

    public byte[] read(long lba, int size){
        byte[] bite = null;
        bite[0]     = 0;
        bite[1]     = 1;
        bite[2]     = 1;
        return bite;
    }
}
