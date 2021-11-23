import java.util.Scanner;
public class DesertShop {

	public static void main(String[] args) {
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter your role :" +"\n" + "1.Owner" + "\n" + "2.Customer");
				int choose=scan.nextInt();
				switch(choose)
				{
					case 1:System.out.println("Add Dessert Items.");
					System.out.println("Choose what u want to add:"+"\n" +"1.Candy" + "\n" +"2.Cookie" + "\n"+ "3.IceCream");
					int chooseId1=scan.nextInt(); 
					switch (chooseId1)
					{
						case 1: System.out.println("Enter Quantities u want to add :");
								int a1=scan.nextInt();
								DesertItem cn =new Candy();
								cn.addTo(a1);
								break;
						case 2:System.out.println("Enter Quantities u want:");
								int a2=scan.nextInt();
								DesertItem co =new Cookie();
								co.addTo(a2);
								break;
						case 3:System.out.println("Enter Quantities u want:");
								int a3=scan.nextInt();
								DesertItem ic=new IceCream();
								ic.addTo(a3);
								break;
						default:System.out.println("Invalid Item");
					}
					break;
					case 2:System.out.println("Choose what u want:"+"\n" +"1.Candy" + "\n" +"2.Cookie" + "\n"+ "3.IceCream");
							int chooseId=scan.nextInt();
							switch (chooseId)
							{
								case 1: System.out.println("Enter Quantities u want :");
										int q1=scan.nextInt();
										DesertItem cn =new Candy();
										cn.getCost(q1);
										break;
								case 2:System.out.println("Enter Quantities u want:");
										int q2=scan.nextInt();
										DesertItem co =new Cookie();
										co.getCost(q2);
										break;
								case 3:System.out.println("Enter Quantities u want:");
										int q3=scan.nextInt();
										DesertItem ic=new IceCream();
										ic.getCost(q3);
										break;
								default:System.out.println("Invalid Item");
							}
							break;
					default:System.out.println("Invalid Item ");
				}
			}
		}

		abstract class DesertItem{
			abstract public void getCost(int q);
			abstract public void addTo(int a);
		}

		class Candy extends DesertItem{
			public void getCost(int q)
			{
				System.out.println("Total Cost is "+ (q*60)+"Rs");
			}
			public void addTo(int a1)
			{
				System.out.println("Quantity of "+ a1 +" Candy is added to Shop ");
			}
		}

		class Cookie extends DesertItem{
			public void getCost(int q)
			{
				System.out.println("Total Cost is "+(q*70)+"Rs");
			}
			public void addTo(int a2)
			{
				System.out.println("Quantity of "+ a2 +" Cookie is added to Shop ");
			}
		}

		class IceCream extends DesertItem{
			public void getCost(int q)
			{
				System.out.println("Total Cost is "+(q*30)+"Rs");
			}
			public void addTo(int a3)
			{
				System.out.println("Quantity of "+ a3 +" Icecream is added to Shop ");
			}
		

	}


