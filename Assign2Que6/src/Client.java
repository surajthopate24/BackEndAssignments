import java.io.*;
import java.util.*;
public class Client {
public static void main(String[] args) {
Persistence fp1=new FilePesistence();
fp1.persist();
Persistence dp2=new DatabasePersistence();
dp2.persist();
}
}
