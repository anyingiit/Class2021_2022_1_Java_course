package JClassHomework_21_12_18_1;

public class USBStrore implements IUSB {// USBStorore, 使用USB作为接口的存储介质, 类似于U盘, 移动硬盘等

  @Override
  public void install() {
    System.out.println("安装U盘驱动程序");
  }

  @Override
  public void work() {
    System.out.println("传输并保存文件");
  }
  
}
