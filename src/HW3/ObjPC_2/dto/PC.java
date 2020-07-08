package HW3.ObjPC_2.dto;

public class PC extends Device implements IDevice{
    CPU cpu;
    ROM rom;
    RAM ram;
    GraphicsAdapterController graph;
    BIOS bios;
    COMPortsController comPorts;
    HardDriveController hardDrive;

    private int errorCode = 0;

    public PC() {
        cpu = new CPU();
        rom = new ROM();
        ram = new RAM();
        graph = new GraphicsAdapterController();
        bios = new BIOS();
        comPorts = new COMPortsController();
        hardDrive = new HardDriveController();
    }

    @Override
    public boolean test() {
        if (!cpu.run()) {
            this.errorCode = ErrorCodes.CPU_ERROR;
            return false;
        } else if (!rom.run()) {
            this.errorCode = ErrorCodes.ROM_ERROR;
            return false;
        } else if (!ram.firstTest()) {
            this.errorCode = ErrorCodes.RAM_ERROR;
            return false;
        } else if (!graph.test()) {
            this.errorCode = ErrorCodes.GRAPH_ERROR;
            return false;
        } else if (!ram.test()) {
            this.errorCode = ErrorCodes.RAM_ERROR;
            return false;
        } else if (!bios.test()) {
            this.errorCode = ErrorCodes.BIOS_ERROR;
            return false;
        } else if (!comPorts.test()) {
            this.errorCode = ErrorCodes.COM_ERROR;
            return false;
        } else if (!hardDrive.test()) {
            this.errorCode = ErrorCodes.CPU_ERROR;
            return false;
        }
        return true;

    }

    public int getErrorCode() {
        return this.errorCode;
    }


}
