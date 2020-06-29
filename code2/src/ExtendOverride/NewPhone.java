package ExtendOverride;

import java.lang.Override;

public class NewPhone extends Phone {

    @Override
    public void show() {
        super.show();//父类的show方法拿来利用
        //自己子类再来添加更多功能
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
