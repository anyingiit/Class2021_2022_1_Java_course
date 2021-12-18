package JClassHomework_21_12_18_1;

public class Computer {
  public void workby(IUSB usb){// workby方法接受实现了IUSB接口的对象, 既接口回调
    usb.install();
    usb.work();
  }
}
