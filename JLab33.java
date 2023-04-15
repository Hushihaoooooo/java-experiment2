package javaʵ��3��3;

import javaʵ��3��.*;

public class JLab33{
	static final char suits[] ={'H','S','D','C'};
	static final String ranks[] ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	static Card[] cards=new Card[52];
	/**
	 * ��ʼ���˿�������
	 */
	public static void init(){
		for(int i=0;i<suits.length;i++){
			for(int j=0;j<ranks.length;j++){
				cards[i*ranks.length+j]=new Card(suits[i],ranks[j]);
			}
		}
	}
	public static void swap1(Card c1,Card c2){
		Card c=c1;
		c1=c2;
		c2=c;
	}
	public static void swap1(int i,int j){
		Card c=cards[i];
		cards[i]=cards[j];
		cards[j]=c;
	}
//	public static void swap2(Card c1,Card c2){
//		char s=c1.suit;
//		c1.suit=c2.suit;
//		c2.suit=s;
//		String r=c1.rank;
//		c1.rank=c2.rank;
//		c2.rank=r;
//	}

	public static void main(final String[] args) {
		init();
		//��ȡ������
		Card c1=cards[10];
		Card c2=cards[12];
		System.out.println("��11�����ǣ�"+c1+"\t��13�����ǣ�"+c2);
		
		swap1(10,12);
		System.out.println("ִ��swap1(10,12)��");
		System.out.println("c1���õ����ǣ�"+c1+"\tc2���õ����ǣ�"+c2);
		System.out.println("��11�����ǣ�"+cards[10]+"\t��13�����ǣ�"+cards[12]);
	}
}




