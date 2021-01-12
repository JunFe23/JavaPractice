package Package3;

import java.awt.Frame;
import java.awt.*; //awt가 가지고 있는 모든 것 import "*"
import java.util.HashMap;

import package1.Super; //package1의 Super를 import

public class PackageMan {
	Super sp; //ctrl + shift + m : import 지정 단축키
	Frame f; //ctrl + shift + o : 한번에 import
	HashMap map;
	String str; //java.lang패키지의 것들은 유니크해서 import 안 해도 됨
}
