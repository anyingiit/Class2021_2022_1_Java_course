package JClassHomework_21_12_18_1;

public class Printer implements IUSB, IPower {
  @Override
  public void install() {
    System.out.println("安装打印机驱动程序");
  }

  @Override
  public void start() {
    System.out.println("打印机打印资料");
  }

  @Override
  public void work() {
    System.out.println("打印机复印文件资料");
  }
}
