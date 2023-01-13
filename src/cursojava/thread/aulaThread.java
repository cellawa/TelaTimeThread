package cursojava.thread;

import javax.swing.JOptionPane;

public class aulaThread {

	public static void main(String[] args) throws InterruptedException {
		/*Thread precessando em paralelo envio de email*/
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
			
		//**** DIVISAO DAS THREADS
		
		
		/*Thread precessando em paralelo envio de nota fiscal*/
		Thread threadNFCe = new Thread(thread2);
		threadNFCe.start();
				
	
		
		/* Codigo do sistema continua o fluxo de trabalho */
		System.out.println("CHEGOU AO FIM FO CODIGO DE THREAD");
		
		
		 /* Fluxo do sistema, cadastro de venda, uma emissão de nota Fiscal, algo do tipo*/
		JOptionPane.showMessageDialog(null, "sistema continua executando para o usuario");
		
		
				
		
	}
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			/*codigo de rotina*/
			
			for (int pos = 0; pos < 10; pos++) {
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}/* Da um tempo */

				/* Quero executar esse envio com o tempo de parada ou com o tempo determinado */
				System.out.println("execuntando alguma rotina, envio de NOTA FISCAL ");

			}

			
		}
	};
	
	
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			/*codigo de rotina*/
			
			for (int pos = 0; pos < 10; pos++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}/* Da um tempo */

				/* Quero executar esse envio com o tempo de parada ou com o tempo determinado */
				System.out.println("execuntando alguma rotina, envio de e-mail");

			}
			
		}
	};
}
