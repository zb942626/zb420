package computer;

public class Computer {
    Cpu cpu;
    Disk disk;
    Memory memory;
    void setCpu(Cpu cpu){
        this.cpu=cpu;
    }
    void setDisk(Disk disk){
        this.disk=disk;
    }
    void  setMemory(Memory memory ){
        this.memory=memory;
    }
    public void print(){
        System.out.println("计算机信息如下：");
        System.out.println("CPU品牌是："+cpu.getCpu());
        System.out.println("硬盘容量是："+disk.getDisk());
        System.out.println("内存容量是："+memory.getMemory());
    }
}
