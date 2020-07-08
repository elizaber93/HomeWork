package HW3.ObjPC.dto;

public class Memory extends Device implements IDevice {
    public Memory(int memorySpace) {
        this.memorySpace = memorySpace;
        this.memory = new int[this.memorySpace];

    }

    private final int memorySpace;
    private int[] memory;

    @Override
    public boolean test() {
        return checkSum(this.memory);
    }

}
