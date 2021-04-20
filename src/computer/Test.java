package computer;

public class Test {
    public static void main(String[] args) {
        Computer computer=new Computer();
        Cpu cpu1=new ChangeCpu();
        Disk disk1 =new ChangeDisk();
        Memory memory1 =new ChangeMemory();
        computer.setCpu(cpu1);
        computer.setDisk(disk1);
        computer.setMemory(memory1);
        computer.print();
    }


}
