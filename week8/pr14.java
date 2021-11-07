package week8;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class pr14 {
	private File currentDir = null;
	private File subFiles [] = null;
	
	public pr14(String Name) {
		currentDir = new File(Name);
	}

	private void showSubDirtories() {
		System.out.println("\t[" + currentDir.getPath() + "]");
		subFiles = currentDir.listFiles();
		for(File f : subFiles) {
			System.out.print(((f.isFile())?"file":"dir"));
			System.out.printf("%-15s", "\t\t" + f.length() + "����Ʈ");
			System.out.println("\t\t" + f.getName());
		}		
	}
	
	void mkdir(String Name) {
		File newDir = new File(currentDir, Name); 
		if(newDir.exists()) 
			System.out.println("�̹� �����ϴ� �����̳� ���͸� �̸��Դϴ�.");
		else {
			System.out.println(Name + " ���͸��� �����Ͽ����ϴ�.");
			newDir.mkdir(); 
			showSubDirtories();
		}
	}
	void rename(String src, String dest) {
		File srcFile = new File(currentDir, src); 
		File destFile = new File(currentDir, dest); 
		if(destFile.exists()) 
			System.out.println("�̹� �����ϴ� �����̳� ���͸� �̸��Դϴ�. �̸� �ٲ� �� �����ϴ�.");
		else {
			System.out.println(src + "�� " + dest + " �̸� �����Ͽ����ϴ�.");
			srcFile.renameTo(destFile); 
			showSubDirtories();
		}
	}
	
	boolean contains(String filename) {
		for(File f : subFiles) {
			if(f.getName().equalsIgnoreCase(filename))
				return true;
		}
		return false;
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***** ���� Ž�����Դϴ�. *****");
		showSubDirtories();
		
		while(true) {
			System.out.print(">>");
			String line = sc.nextLine().trim(); 
			StringTokenizer st = new StringTokenizer(line, " "); 
			String command = st.nextToken(); 
			if(command.equals("�׸�"))
				break; 
			if(command.equals("..")) {
				String s = currentDir.getParent();
				if(s == null) 
					continue;
				else { 					
					currentDir = new File(currentDir.getParent());
					showSubDirtories();
				}

			}
			if(command.equalsIgnoreCase("mkdir")) {
				try {
					String dirName = st.nextToken(); 
					mkdir(dirName);
				} catch(NoSuchElementException e) {
					System.out.println("������ ���͸����� �־����� �ʾҽ��ϴ�!");
				}
			}
			else if(command.equalsIgnoreCase("rename")) {
				try { 
					String src = st.nextToken(); 
					String dest = st.nextToken(); 
					rename(src, dest);
				} catch(NoSuchElementException e) {
					System.out.println("�� ���� ���ϸ��� �־����� �ʾҽ��ϴ�.!");
				}
			}
			else { 
				if(contains(command)) { 
					if(new File(currentDir, command).isDirectory()) { 
						currentDir = new File(currentDir, command);
						showSubDirtories();
					}
					else { 
						System.out.println("\t���͸��� �ƴմϴ�.!");
					}
				}
			}
		}
		
		sc.close();
	}
	
	public static void main(String[] args) {
		pr14 f = new pr14("c:\\");
		f.run();
	}

}