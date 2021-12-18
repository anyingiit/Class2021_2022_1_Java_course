package JClassHomework_21_12_18_1;

public class USBStrore implements IUSB {

  @Override
  public void install() {
    System.out.println("安装U盘驱动程序");
  }

  @Override
  public void work() {
    System.out.println("传输并保存文件");
  }
  
}
