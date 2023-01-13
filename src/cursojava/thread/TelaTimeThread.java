package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout());/*Painel de componente*/

	private JLabel descricaoHora = new JLabel("Time da thread 1 ");
	
	private JTextField mostraTempo = new JTextField();
	
	
	private JButton jbutton = new JButton("Start");
	private JButton jbutton2 = new JButton("Stop");
	
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			while(true) { /*fica sempre rodando*/
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").
						format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}; 
	
	
private Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			while(true) { /*fica sempre rodando*/
				mostraTempo2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").
						format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}; 
	
	private Thread  thread1Time;
	private Thread  thread2Time;

	
	
private JLabel descricaoHora2 = new JLabel("Time da thread 2 ");
	
	private JTextField mostraTempo2 = new JTextField();
	
	public TelaTimeThread() { /* Executa o que tiver dentro no momento da abertura ou execução */
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		/*Primeira parte concluida*/ 
		
		GridBagConstraints gridbagConstraints = new GridBagConstraints();/*Controlado de posicionameto de componentes*/
		gridbagConstraints.gridx = 0;
		gridbagConstraints.gridy = 0;
		gridbagConstraints.gridwidth = 2;
		gridbagConstraints.insets = new Insets(5, 10, 5, 5);
		gridbagConstraints.anchor = GridBagConstraints.WEST;
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		
		jPanel.add(descricaoHora, gridbagConstraints);
		
		
		mostraTempo.setPreferredSize(new Dimension(200, 25 ));
		gridbagConstraints.gridy ++;
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo, gridbagConstraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		mostraTempo2.setEditable(false);
		gridbagConstraints.gridy ++;
		jPanel.add(descricaoHora2, gridbagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridbagConstraints.gridy ++;
		jPanel.add(mostraTempo2, gridbagConstraints);
		
		//***********************
		
		gridbagConstraints.gridwidth = 1;
		
		
		jbutton.setPreferredSize(new Dimension(92, 25));
		gridbagConstraints.gridy ++;
		jPanel.add(jbutton, gridbagConstraints);
		
		jbutton2.setPreferredSize(new Dimension(92, 25));
		gridbagConstraints.gridx ++;
		jPanel.add(jbutton2, gridbagConstraints);
		
		jbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {/*Executa o clique no botao*/
			thread1Time = new Thread(thread1);
			thread1Time.start();
			
			
			thread2Time = new Thread(thread2);
			thread2Time.start();
			
			
			}
		});
		jbutton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time.stop();
				
				thread2Time.stop();

				
			}
		});
		add(jPanel, BorderLayout.WEST);
		
		/*Sempre será o  ultimo comando*/
		setVisible(true);/*Torna visivel para o usuário*/

	}

}
