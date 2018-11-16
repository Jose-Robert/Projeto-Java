
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame implements ActionListener {

   
   private ArrayList listaMedicamentoSimilar = new ArrayList();
   private ArrayList listaMedicamentoAlopatico = new ArrayList();
   private ArrayList listaMedicamentoFitoterapico = new ArrayList();
   private ArrayList listaMedicamentoGenerico = new ArrayList();
   private ArrayList listaMedicamentoHomeopatico = new ArrayList();
   private ArrayList listaMedicamentoManipulado = new ArrayList();
   private ArrayList listaMedicamentoReferencia = new ArrayList();
   private ArrayList listaMedicamentoDinamizado = new ArrayList();
   private ArrayList<Integer> flag = new ArrayList();
   
   
    public Main() {
        initComponents();   
        jPanel4.setVisible(false);
        jPanel8.setVisible(false);
        jPanel4.setVisible(false);
        jLabel28.setVisible(false);
        jTextField13.setVisible(false);
        jLabel29.setVisible(false);
        jTextArea13.setVisible(false);
        jScrollPane14.setVisible(false);
        clear();
        numAuto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane13 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jTextField12 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextArea10.setColumns(20);
        jTextArea10.setRows(5);
        jTextArea10.setText("informações adicionais");
        jScrollPane10.setViewportView(jTextArea10);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("contraindicações");
        jScrollPane4.setViewportView(jTextArea4);

        jButton2.setText("Limpar");
        jButton2.addActionListener(this);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("info");
        jScrollPane2.setViewportView(jTextArea2);

        jLabel2.setText("Nome");

        jLabel26.setText("Referência");

        jTextField9.setText("referencia");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel26))
        );

        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jTextArea8.setText("posologia");
        jScrollPane8.setViewportView(jTextArea8);

        jLabel9.setText("Contraindicações");

        jLabel8.setText("Indicações");

        jLabel4.setText("Preço");

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jTextArea7.setText("reações adversas");
        jScrollPane7.setViewportView(jTextArea7);

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(this);

        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);
        jTextArea9.setText("superdosagem");
        jScrollPane9.setViewportView(jTextArea9);

        jTextField2.setText("Princ");

        jTextField1.setText("Nome");
        jTextField1.addActionListener(this);

        jLabel14.setText("Superdosagem");

        jTextField4.setText("validade");

        jLabel6.setText("Informações Adicionais");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Genérico", "Similar", "Alopático", "Fitoterápico", "Homeopático", "Manipulado", "Referência" }));
        jComboBox1.addActionListener(this);

        jLabel10.setText("Precauções");

        jLabel7.setText("Validade");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("composição");
        jScrollPane1.setViewportView(jTextArea1);

        jTextField5.setEditable(false);
        jTextField5.addActionListener(this);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cadastro de Medicamento");

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jTextArea6.setText("interações");
        jScrollPane6.setViewportView(jTextArea6);

        jLabel16.setText("Código");

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setText("precauções");
        jScrollPane5.setViewportView(jTextArea5);

        jLabel12.setText("Reações Adversas");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("indicações");
        jScrollPane3.setViewportView(jTextArea3);

        jLabel11.setText("Interações");

        jTextField3.setText("preco");

        jLabel23.setText("Tipo");

        jLabel5.setText("Composição");

        jLabel13.setText("Posologia");

        jLabel3.setText("Princípio Ativo");

        jLabel15.setText("Informações Adicionais");

        jTextField12.setText("status da patente");

        jLabel27.setText("Status da Patente");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel27))
        );

        jTextArea13.setColumns(20);
        jTextArea13.setRows(5);
        jScrollPane14.setViewportView(jTextArea13);

        jLabel29.setText("Info. do Paciente");

        jTextField13.setText("Farmacia Mani");
        jTextField13.addActionListener(this);

        jLabel28.setText("Farmacia de Manipulação");

        jLabel41.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(204, 0, 0));
        jLabel41.setText("OBS: No campo preço deve ser informado apenas números.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel29))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                                            .addComponent(jScrollPane9)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                .addComponent(jButton2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1))
                                            .addComponent(jScrollPane14)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField5))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField13))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel28))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextArea11.setColumns(20);
        jTextArea11.setRows(5);
        jScrollPane11.setViewportView(jTextArea11);

        jButton3.setText("Gerar Relatório de Medicamento");
        jButton3.addActionListener(this);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(266, 292, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Mostrar Medicamentos", jPanel2);

        jLabel20.setText("Nome");

        jLabel21.setText("Princípio Ativo");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Pesquisar");

        jLabel24.setText("Indicações");

        jLabel25.setText("Contraindic.");

        jTextArea12.setColumns(20);
        jTextArea12.setRows(5);
        jScrollPane12.setViewportView(jTextArea12);

        jButton6.setText("Gerar");
        jButton6.addActionListener(this);

        jButton8.setText("Gerar");
        jButton8.addActionListener(this);

        jButton9.setText("Gerar");
        jButton9.addActionListener(this);

        jButton5.setText("Gerar");
        jButton5.addActionListener(this);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                                    .addComponent(jTextField11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton9)
                                    .addComponent(jButton8)
                                    .addComponent(jButton6)))
                            .addComponent(jLabel22))
                        .addContainerGap(15, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Busca por Atributo", jPanel3);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Pesquisar");

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel31.setText("Medicamentos Alopáticos");

        jButton11.setText("Gerar");
        jButton11.addActionListener(this);

        jButton7.setText("Gerar");
        jButton7.addActionListener(this);

        jButton12.setText("Gerar");
        jButton12.addActionListener(this);

        jLabel32.setText("Medicamentos Fitorerápicos");

        jLabel33.setText("Medicamentos Homeopáticos");

        jButton16.setText("Gerar");
        jButton16.addActionListener(this);

        jLabel37.setText("Medicamentos Manipulados");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton12)
                            .addComponent(jButton11)
                            .addComponent(jButton7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jButton16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel35.setText("Medicamentos Similares");

        jButton15.setText("Gerar");
        jButton15.addActionListener(this);

        jLabel34.setText("Medicamentos Genéricos");

        jLabel36.setText("Medicamentos Referência");

        jButton14.setText("Gerar");
        jButton14.addActionListener(this);

        jButton13.setText("Gerar");
        jButton13.addActionListener(this);

        jButton17.setText("Gerar");
        jButton17.addActionListener(this);

        jLabel42.setText("Medicamentos Dinamizados");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton15, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jButton13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jButton17))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTextArea14.setColumns(20);
        jTextArea14.setRows(5);
        jScrollPane15.setViewportView(jTextArea14);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(20, 421, Short.MAX_VALUE))
                    .addComponent(jScrollPane15)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Busca por Grupo", jPanel9);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Relatórios Gerais");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel19.setText("Digite o Código do Medicamento a ser Removido");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Remover Medicamento");

        jTextField6.addActionListener(this);

        jButton4.setText("Remover");
        jButton4.addActionListener(this);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton10.setText("Limpar");
        jButton10.addActionListener(this);

        jLabel38.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 0, 0));
        jLabel38.setText("OBS: Medicamentos dos tipos Homeopáticos, Alópaticos e Fitoterápicos possuem Composição Padrão, ");

        jLabel39.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(204, 0, 0));
        jLabel39.setText("não sendo necesário informar durante o cadastro. Medicamentos Genéricos possuem como Nome, o ");

        jLabel40.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(204, 0, 0));
        jLabel40.setText("próprio Princípio ativo.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel39)
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(120, 120, 120))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        jScrollPane13.setViewportView(jPanel1);

        getContentPane().add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 680));

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == jButton2) {
            Main.this.jButton2ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton1) {
            Main.this.jButton1ActionPerformed(evt);
        }
        else if (evt.getSource() == jTextField1) {
            Main.this.jTextField1ActionPerformed(evt);
        }
        else if (evt.getSource() == jComboBox1) {
            Main.this.jComboBox1ActionPerformed(evt);
        }
        else if (evt.getSource() == jTextField5) {
            Main.this.jTextField5ActionPerformed(evt);
        }
        else if (evt.getSource() == jTextField13) {
            Main.this.jTextField13ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton3) {
            Main.this.jButton3ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton6) {
            Main.this.jButton6ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton8) {
            Main.this.jButton8ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton9) {
            Main.this.jButton9ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton5) {
            Main.this.jButton5ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton11) {
            Main.this.jButton11ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton7) {
            Main.this.jButton7ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton12) {
            Main.this.jButton12ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton16) {
            Main.this.jButton16ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton15) {
            Main.this.jButton15ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton14) {
            Main.this.jButton14ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton13) {
            Main.this.jButton13ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton17) {
            Main.this.jButton17ActionPerformed(evt);
        }
        else if (evt.getSource() == jTextField6) {
            Main.this.jTextField6ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton4) {
            Main.this.jButton4ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton10) {
            Main.this.jButton10ActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jTextArea11.setText("");
        jTextArea12.setText("");
        jTextArea14.setText("");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        for(int i=0 ; i < listaMedicamentoSimilar.size() ; i++){
            MedicamentoSimilar medAtual = (MedicamentoSimilar) listaMedicamentoSimilar.get(i);
            int codAtual = medAtual.getCodigo();

            if(Integer.toString(codAtual).compareTo(jTextField6.getText()) == 0){
                listaMedicamentoSimilar.remove(i);
                for(int j=0;j<flag.size();j++){
                    if(Integer.toString(flag.get(j)).compareTo(jTextField6.getText()) == 0)
                        flag.remove(j);
                }
                JOptionPane.showMessageDialog(null, "Medicamento Removido!");
                
            }
        }
        for(int i=0 ; i < listaMedicamentoAlopatico.size() ; i++){
            MedicamentoAlopatico medAtual = (MedicamentoAlopatico) listaMedicamentoAlopatico.get(i);
            int codAtual = medAtual.getCodigo();

            if(Integer.toString(codAtual).compareTo(jTextField6.getText()) == 0){
                listaMedicamentoAlopatico.remove(i);
                for(int j=0;j<flag.size();j++){
                    if(Integer.toString(flag.get(j)).compareTo(jTextField6.getText()) == 0)
                        flag.remove(j);
                }
                JOptionPane.showMessageDialog(null, "Medicamento Removido!");
            }
        }
        for(int i=0 ; i < listaMedicamentoFitoterapico.size() ; i++){
            MedicamentoFitoterapico medAtual = (MedicamentoFitoterapico) listaMedicamentoFitoterapico.get(i);
            int codAtual = medAtual.getCodigo();

            if(Integer.toString(codAtual).compareTo(jTextField6.getText()) == 0){
                listaMedicamentoFitoterapico.remove(i);
                for(int j=0;j<flag.size();j++){
                    if(Integer.toString(flag.get(j)).compareTo(jTextField6.getText()) == 0)
                        flag.remove(j);
                }
                JOptionPane.showMessageDialog(null, "Medicamento Removido!");
            }
        }
        for(int i=0 ; i < listaMedicamentoGenerico.size() ; i++){
            MedicamentoGenerico medAtual = (MedicamentoGenerico) listaMedicamentoGenerico.get(i);
            int codAtual = medAtual.getCodigo();

            if(Integer.toString(codAtual).compareTo(jTextField6.getText()) == 0){
                listaMedicamentoGenerico.remove(i);
                for(int j=0;j<flag.size();j++){
                    if(Integer.toString(flag.get(j)).compareTo(jTextField6.getText()) == 0)
                        flag.remove(j);
                }
                JOptionPane.showMessageDialog(null, "Medicamento Removido!");
            }
        }
        for(int i=0 ; i < listaMedicamentoHomeopatico.size() ; i++){
            MedicamentoHomeopatico medAtual = (MedicamentoHomeopatico) listaMedicamentoHomeopatico.get(i);
            int codAtual = medAtual.getCodigo();

            if(Integer.toString(codAtual).compareTo(jTextField6.getText()) == 0){
                listaMedicamentoHomeopatico.remove(i);
                for(int j=0;j<flag.size();j++){
                    if(Integer.toString(flag.get(j)).compareTo(jTextField6.getText()) == 0)
                        flag.remove(j);
                }
                JOptionPane.showMessageDialog(null, "Medicamento Removido!");
            }
        }
        for(int i=0 ; i < listaMedicamentoManipulado.size() ; i++){
            MedicamentoManipulado medAtual = (MedicamentoManipulado) listaMedicamentoManipulado.get(i);
            int codAtual = medAtual.getCodigo();

            if(Integer.toString(codAtual).compareTo(jTextField6.getText()) == 0){
                listaMedicamentoManipulado.remove(i);
                for(int j=0;j<flag.size();j++){
                    if(Integer.toString(flag.get(j)).compareTo(jTextField6.getText()) == 0)
                        flag.remove(j);
                }
                JOptionPane.showMessageDialog(null, "Medicamento Removido!");

            }
        }
        for(int i=0 ; i < listaMedicamentoReferencia.size() ; i++){
            MedicamentoReferencia medAtual = (MedicamentoReferencia) listaMedicamentoReferencia.get(i);
            int codAtual = medAtual.getCodigo();

            if(Integer.toString(codAtual).compareTo(jTextField6.getText()) == 0){
                listaMedicamentoReferencia.remove(i);
                for(int j=0;j<flag.size();j++){
                    if(Integer.toString(flag.get(j)).compareTo(jTextField6.getText()) == 0)
                        flag.remove(j);
                }
                JOptionPane.showMessageDialog(null, "Medicamento Removido!");
            }
        }
        for(int i=0 ; i < listaMedicamentoDinamizado.size() ; i++){
            MedicamentoDinamizado medAtual = (MedicamentoDinamizado) listaMedicamentoDinamizado.get(i);
            int codAtual = medAtual.getCodigo();
            if(Integer.toString(codAtual).compareTo(jTextField6.getText()) == 0)
                listaMedicamentoDinamizado.remove(i);

        }
        jTextArea11.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextArea12.setText("");
        String aux2 = jTextArea12.getText();
        int count = (listaMedicamentoSimilar.size()+listaMedicamentoAlopatico.size()+listaMedicamentoFitoterapico.size()+listaMedicamentoGenerico.size()+listaMedicamentoHomeopatico.size()+listaMedicamentoManipulado.size()+listaMedicamentoReferencia.size());
        int index = 0;
        
        for(int x=1 ; x <= count ; x++){    
            
            for(int i=0 ; i < listaMedicamentoSimilar.size() ; i++){
                MedicamentoSimilar medAtual = (MedicamentoSimilar) listaMedicamentoSimilar.get(i);
                int codigoAtual = medAtual.getCodigo();
                String nomeAtual = medAtual.getNomeMed();                
                if(codigoAtual == flag.get(index)){
                    if(nomeAtual.compareTo(jTextField7.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }              
            }
            
            for(int i=0 ; i < listaMedicamentoAlopatico.size() ; i++){
                MedicamentoAlopatico medAtual = (MedicamentoAlopatico) listaMedicamentoAlopatico.get(i);
                int codigoAtual = medAtual.getCodigo();                
                String nomeAtual = medAtual.getNomeMed();                
                if(codigoAtual == flag.get(index)){
                    if(nomeAtual.compareTo(jTextField7.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
            for(int i=0 ; i < listaMedicamentoFitoterapico.size() ; i++){
                MedicamentoFitoterapico medAtual = (MedicamentoFitoterapico) listaMedicamentoFitoterapico.get(i);
                int codigoAtual = medAtual.getCodigo();                
                String nomeAtual = medAtual.getNomeMed();                
                if(codigoAtual == flag.get(index)){
                    if(nomeAtual.compareTo(jTextField7.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
            for(int i=0 ; i < listaMedicamentoGenerico.size() ; i++){
                MedicamentoGenerico medAtual = (MedicamentoGenerico) listaMedicamentoGenerico.get(i);
                int codigoAtual = medAtual.getCodigo();
                String nomeAtual = medAtual.getNomeMed();                
                if(codigoAtual == flag.get(index)){
                    if(nomeAtual.compareTo(jTextField7.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
            for(int i=0 ; i < listaMedicamentoHomeopatico.size() ; i++){
                MedicamentoHomeopatico medAtual = (MedicamentoHomeopatico) listaMedicamentoHomeopatico.get(i);
                int codigoAtual = medAtual.getCodigo();
                String nomeAtual = medAtual.getNomeMed();                
                if(codigoAtual == flag.get(index)){
                    if(nomeAtual.compareTo(jTextField7.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
            for(int i=0 ; i < listaMedicamentoManipulado.size() ; i++){
                MedicamentoManipulado medAtual = (MedicamentoManipulado) listaMedicamentoManipulado.get(i);
                int codigoAtual = medAtual.getCodigo();
                String nomeAtual = medAtual.getNomeMed();                
                if(codigoAtual == flag.get(index)){
                    if(nomeAtual.compareTo(jTextField7.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
            for(int i=0 ; i < listaMedicamentoReferencia.size() ; i++){
                MedicamentoReferencia medAtual = (MedicamentoReferencia) listaMedicamentoReferencia.get(i);
                int codigoAtual = medAtual.getCodigo();
                String nomeAtual = medAtual.getNomeMed();                
                if(codigoAtual == flag.get(index)){
                    if(nomeAtual.compareTo(jTextField7.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
    
        }
        
        jTextField7.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jTextArea12.setText("");
        String aux2 = jTextArea12.getText();
        int count = (listaMedicamentoSimilar.size()+listaMedicamentoAlopatico.size()+listaMedicamentoFitoterapico.size()+listaMedicamentoGenerico.size()+listaMedicamentoHomeopatico.size()+listaMedicamentoManipulado.size()+listaMedicamentoReferencia.size());
        int index = 0;
        
        for(int x=1 ; x <= count ; x++){    
            
            for(int i=0 ; i < listaMedicamentoSimilar.size() ; i++){
                MedicamentoSimilar medAtual = (MedicamentoSimilar) listaMedicamentoSimilar.get(i);
                int codigoAtual = medAtual.getCodigo();
                String contraIndicacoesAtual = medAtual.getContraIndicacoes();                
                if(codigoAtual == flag.get(index)){
                    if(contraIndicacoesAtual.compareTo(jTextField11.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }              
            }
            
            for(int i=0 ; i < listaMedicamentoAlopatico.size() ; i++){
                MedicamentoAlopatico medAtual = (MedicamentoAlopatico) listaMedicamentoAlopatico.get(i);
                int codigoAtual = medAtual.getCodigo();                
                String contraIndicacoesAtual = medAtual.getContraIndicacoes();                
                if(codigoAtual == flag.get(index)){
                    if(contraIndicacoesAtual.compareTo(jTextField11.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
            for(int i=0 ; i < listaMedicamentoFitoterapico.size() ; i++){
                MedicamentoFitoterapico medAtual = (MedicamentoFitoterapico) listaMedicamentoFitoterapico.get(i);
                int codigoAtual = medAtual.getCodigo();                
                String contraIndicacoesAtual = medAtual.getContraIndicacoes();                
                if(codigoAtual == flag.get(index)){
                    if(contraIndicacoesAtual.compareTo(jTextField11.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
            for(int i=0 ; i < listaMedicamentoGenerico.size() ; i++){
                MedicamentoGenerico medAtual = (MedicamentoGenerico) listaMedicamentoGenerico.get(i);
                int codigoAtual = medAtual.getCodigo();
                String contraIndicacoesAtual = medAtual.getContraIndicacoes();                
                if(codigoAtual == flag.get(index)){
                    if(contraIndicacoesAtual.compareTo(jTextField11.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
            for(int i=0 ; i < listaMedicamentoHomeopatico.size() ; i++){
                MedicamentoHomeopatico medAtual = (MedicamentoHomeopatico) listaMedicamentoHomeopatico.get(i);
                int codigoAtual = medAtual.getCodigo();
                String contraIndicacoesAtual = medAtual.getContraIndicacoes();                
                if(codigoAtual == flag.get(index)){
                    if(contraIndicacoesAtual.compareTo(jTextField11.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
            for(int i=0 ; i < listaMedicamentoManipulado.size() ; i++){
                MedicamentoManipulado medAtual = (MedicamentoManipulado) listaMedicamentoManipulado.get(i);
                int codigoAtual = medAtual.getCodigo();
                String contraIndicacoesAtual = medAtual.getContraIndicacoes();                
                if(codigoAtual == flag.get(index)){
                    if(contraIndicacoesAtual.compareTo(jTextField11.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
            for(int i=0 ; i < listaMedicamentoReferencia.size() ; i++){
                MedicamentoReferencia medAtual = (MedicamentoReferencia) listaMedicamentoReferencia.get(i);
                int codigoAtual = medAtual.getCodigo();
                String contraIndicacoesAtual = medAtual.getContraIndicacoes();                
                if(codigoAtual == flag.get(index)){
                    if(contraIndicacoesAtual.compareTo(jTextField11.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
    
        }
        
        jTextField11.setText("");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jTextArea12.setText("");
        String aux2 = jTextArea12.getText();
        int count = (listaMedicamentoSimilar.size()+listaMedicamentoAlopatico.size()+listaMedicamentoFitoterapico.size()+listaMedicamentoGenerico.size()+listaMedicamentoHomeopatico.size()+listaMedicamentoManipulado.size()+listaMedicamentoReferencia.size());
        int index = 0;
        
        for(int x=1 ; x <= count ; x++){    
            
            for(int i=0 ; i < listaMedicamentoSimilar.size() ; i++){
                MedicamentoSimilar medAtual = (MedicamentoSimilar) listaMedicamentoSimilar.get(i);
                int codigoAtual = medAtual.getCodigo();
                String indicacoesAtual = medAtual.getIndicacoes();                
                if(codigoAtual == flag.get(index)){
                    if(indicacoesAtual.compareTo(jTextField10.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }              
            }
            
            for(int i=0 ; i < listaMedicamentoAlopatico.size() ; i++){
                MedicamentoAlopatico medAtual = (MedicamentoAlopatico) listaMedicamentoAlopatico.get(i);
                int codigoAtual = medAtual.getCodigo();                
                String indicacoesAtual = medAtual.getIndicacoes();                
                if(codigoAtual == flag.get(index)){
                    if(indicacoesAtual.compareTo(jTextField10.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
            for(int i=0 ; i < listaMedicamentoFitoterapico.size() ; i++){
                MedicamentoFitoterapico medAtual = (MedicamentoFitoterapico) listaMedicamentoFitoterapico.get(i);
                int codigoAtual = medAtual.getCodigo();                
                String indicacoesAtual = medAtual.getIndicacoes();                
                if(codigoAtual == flag.get(index)){
                    if(indicacoesAtual.compareTo(jTextField10.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
            for(int i=0 ; i < listaMedicamentoGenerico.size() ; i++){
                MedicamentoGenerico medAtual = (MedicamentoGenerico) listaMedicamentoGenerico.get(i);
                int codigoAtual = medAtual.getCodigo();
                String indicacoesAtual = medAtual.getIndicacoes();                
                if(codigoAtual == flag.get(index)){
                    if(indicacoesAtual.compareTo(jTextField10.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
            for(int i=0 ; i < listaMedicamentoHomeopatico.size() ; i++){
                MedicamentoHomeopatico medAtual = (MedicamentoHomeopatico) listaMedicamentoHomeopatico.get(i);
                int codigoAtual = medAtual.getCodigo();
                String indicacoesAtual = medAtual.getIndicacoes();                
                if(codigoAtual == flag.get(index)){
                    if(indicacoesAtual.compareTo(jTextField10.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
            for(int i=0 ; i < listaMedicamentoManipulado.size() ; i++){
                MedicamentoManipulado medAtual = (MedicamentoManipulado) listaMedicamentoManipulado.get(i);
                int codigoAtual = medAtual.getCodigo();
                String indicacoesAtual = medAtual.getIndicacoes();                
                if(codigoAtual == flag.get(index)){
                    if(indicacoesAtual.compareTo(jTextField10.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
            for(int i=0 ; i < listaMedicamentoReferencia.size() ; i++){
                MedicamentoReferencia medAtual = (MedicamentoReferencia) listaMedicamentoReferencia.get(i);
                int codigoAtual = medAtual.getCodigo();
                String indicacoesAtual = medAtual.getIndicacoes();                
                if(codigoAtual == flag.get(index)){
                    if(indicacoesAtual.compareTo(jTextField10.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
    
        }
        
        jTextField10.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTextArea12.setText("");
        String aux2 = jTextArea12.getText();
        int count = (listaMedicamentoSimilar.size()+listaMedicamentoAlopatico.size()+listaMedicamentoFitoterapico.size()+listaMedicamentoGenerico.size()+listaMedicamentoHomeopatico.size()+listaMedicamentoManipulado.size()+listaMedicamentoReferencia.size());
        int index = 0;
        
        for(int x=1 ; x <= count ; x++){    
            
            for(int i=0 ; i < listaMedicamentoSimilar.size() ; i++){
                MedicamentoSimilar medAtual = (MedicamentoSimilar) listaMedicamentoSimilar.get(i);
                int codigoAtual = medAtual.getCodigo();
                String princAtivAtual = medAtual.getPrincAtiv();                
                if(codigoAtual == flag.get(index)){
                    if(princAtivAtual.compareTo(jTextField8.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }              
            }
            
            for(int i=0 ; i < listaMedicamentoAlopatico.size() ; i++){
                MedicamentoAlopatico medAtual = (MedicamentoAlopatico) listaMedicamentoAlopatico.get(i);
                int codigoAtual = medAtual.getCodigo();                
                String princAtivAtual = medAtual.getPrincAtiv();                
                if(codigoAtual == flag.get(index)){
                    if(princAtivAtual.compareTo(jTextField8.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
            for(int i=0 ; i < listaMedicamentoFitoterapico.size() ; i++){
                MedicamentoFitoterapico medAtual = (MedicamentoFitoterapico) listaMedicamentoFitoterapico.get(i);
                int codigoAtual = medAtual.getCodigo();                
                String princAtivAtual = medAtual.getPrincAtiv();                
                if(codigoAtual == flag.get(index)){
                    if(princAtivAtual.compareTo(jTextField8.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
            for(int i=0 ; i < listaMedicamentoGenerico.size() ; i++){
                MedicamentoGenerico medAtual = (MedicamentoGenerico) listaMedicamentoGenerico.get(i);
                int codigoAtual = medAtual.getCodigo();
                String princAtivAtual = medAtual.getPrincAtiv();                
                if(codigoAtual == flag.get(index)){
                    if(princAtivAtual.compareTo(jTextField8.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
            for(int i=0 ; i < listaMedicamentoHomeopatico.size() ; i++){
                MedicamentoHomeopatico medAtual = (MedicamentoHomeopatico) listaMedicamentoHomeopatico.get(i);
                int codigoAtual = medAtual.getCodigo();
                String princAtivAtual = medAtual.getPrincAtiv();                
                if(codigoAtual == flag.get(index)){
                    if(princAtivAtual.compareTo(jTextField8.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
            for(int i=0 ; i < listaMedicamentoManipulado.size() ; i++){
                MedicamentoManipulado medAtual = (MedicamentoManipulado) listaMedicamentoManipulado.get(i);
                int codigoAtual = medAtual.getCodigo();
                String princAtivAtual = medAtual.getPrincAtiv();                
                if(codigoAtual == flag.get(index)){
                    if(princAtivAtual.compareTo(jTextField8.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
            for(int i=0 ; i < listaMedicamentoReferencia.size() ; i++){
                MedicamentoReferencia medAtual = (MedicamentoReferencia) listaMedicamentoReferencia.get(i);
                int codigoAtual = medAtual.getCodigo();
                String princAtivAtual = medAtual.getPrincAtiv();                
                if(codigoAtual == flag.get(index)){
                    if(princAtivAtual.compareTo(jTextField8.getText()) == 0){
                        jTextArea12.setText(aux2+medAtual.toString()+"\n");
                        index++;
                        aux2 = jTextArea12.getText();
                    }
                    else{
                        index++;
                    }
                }
            }
    
        }
        
        jTextField8.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextArea11.setText("");
        String aux2 = jTextArea11.getText();
        int count = (listaMedicamentoSimilar.size()+listaMedicamentoAlopatico.size()+listaMedicamentoFitoterapico.size()+listaMedicamentoGenerico.size()+listaMedicamentoHomeopatico.size()+listaMedicamentoManipulado.size()+listaMedicamentoReferencia.size());
        int index = 0;
        
        for(int x=1 ; x <= count ; x++){    
            
            for(int i=0 ; i < listaMedicamentoSimilar.size() ; i++){
                MedicamentoSimilar medAtual = (MedicamentoSimilar) listaMedicamentoSimilar.get(i);
                int codigoAtual = medAtual.getCodigo();                
                if(codigoAtual == flag.get(index)){
                    jTextArea11.setText(aux2+medAtual.toString()+"\n");
                    index++;
                    aux2 = jTextArea11.getText();
                    break;
                }              
            }
            
            for(int i=0 ; i < listaMedicamentoAlopatico.size() ; i++){
                MedicamentoAlopatico medAtual = (MedicamentoAlopatico) listaMedicamentoAlopatico.get(i);
                int codigoAtual = medAtual.getCodigo();                
                if(codigoAtual == flag.get(index)){
                    jTextArea11.setText(aux2+medAtual.toString()+"\n");
                    index++;
                    aux2 = jTextArea11.getText();
                    break;
                }
            }
            for(int i=0 ; i < listaMedicamentoFitoterapico.size() ; i++){
                MedicamentoFitoterapico medAtual = (MedicamentoFitoterapico) listaMedicamentoFitoterapico.get(i);
                int codigoAtual = medAtual.getCodigo();                
                if(codigoAtual == flag.get(index)){
                    jTextArea11.setText(aux2+medAtual.toString()+"\n");
                    index++;
                    aux2 = jTextArea11.getText();
                    break;
                }
            }
            for(int i=0 ; i < listaMedicamentoGenerico.size() ; i++){
                MedicamentoGenerico medAtual = (MedicamentoGenerico) listaMedicamentoGenerico.get(i);
                int codigoAtual = medAtual.getCodigo();
                if(codigoAtual == flag.get(index)){
                    jTextArea11.setText(aux2+medAtual.toString()+"\n");
                    index++;
                    aux2 = jTextArea11.getText();
                    break;
                }
            }
            for(int i=0 ; i < listaMedicamentoHomeopatico.size() ; i++){
                MedicamentoHomeopatico medAtual = (MedicamentoHomeopatico) listaMedicamentoHomeopatico.get(i);
                int codigoAtual = medAtual.getCodigo();
                if(codigoAtual == flag.get(index)){
                    jTextArea11.setText(aux2+medAtual.toString()+"\n");
                    index++;
                    aux2 = jTextArea11.getText();
                    break;
                }
            }
            for(int i=0 ; i < listaMedicamentoManipulado.size() ; i++){
                MedicamentoManipulado medAtual = (MedicamentoManipulado) listaMedicamentoManipulado.get(i);
                int codigoAtual = medAtual.getCodigo();
                if(codigoAtual == flag.get(index)){
                    jTextArea11.setText(aux2+medAtual.toString()+"\n");
                    index++;
                    aux2 = jTextArea11.getText();
                    break;
                }
            }
            for(int i=0 ; i < listaMedicamentoReferencia.size() ; i++){
                MedicamentoReferencia medAtual = (MedicamentoReferencia) listaMedicamentoReferencia.get(i);
                int codigoAtual = medAtual.getCodigo();
                if(codigoAtual == flag.get(index)){
                    jTextArea11.setText(aux2+medAtual.toString()+"\n");
                    index++;
                    aux2 = jTextArea11.getText();
                    break;
                }
            }
    
        }           
       // jTextArea11.setText(listaMedicamentoSimilar.toString()+listaMedicamentoAlopatico.toString()+listaMedicamentoFitoterapico.toString()+listaMedicamentoGenerico.toString()+listaMedicamentoHomeopatico.toString()+listaMedicamentoManipulado.toString()+listaMedicamentoReferencia.toString());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed

    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getModel().getSelectedItem() == "Similar"){
            clear();
            jPanel4.setVisible(true);
            jPanel8.setVisible(false);
            jTextArea1.setEditable(true);
            jTextArea1.setBackground(Color.white);
            jLabel29.setVisible(false);
            jTextArea13.setVisible(false);
            jScrollPane14.setVisible(false);
            jLabel28.setVisible(false);
            jTextField13.setVisible(false);
            jTextField1.setEditable(true);
            jTextField1.setBackground(Color.white);
        }
        else if (jComboBox1.getModel().getSelectedItem() == "Genérico"){
            clear();
            jPanel4.setVisible(true);
            jPanel8.setVisible(false);
            jTextArea1.setEditable(true);
            jTextArea1.setBackground(Color.white);
            jLabel29.setVisible(false);
            jTextArea13.setVisible(false);
            jScrollPane14.setVisible(false);
            jLabel28.setVisible(false);
            jTextField13.setVisible(false);
            jTextField1.setEditable(false);
            jTextField1.setBackground(Color.LIGHT_GRAY);
        }
        else if (jComboBox1.getModel().getSelectedItem() == "Alopático"){
            clear();
            jPanel4.setVisible(false);
            jPanel8.setVisible(false);
            jTextArea1.setEditable(false);
            jTextArea1.setBackground(Color.LIGHT_GRAY);
            jLabel29.setVisible(false);
            jTextArea13.setVisible(false);
            jScrollPane14.setVisible(false);
            jLabel28.setVisible(false);
            jTextField13.setVisible(false);
            jTextField1.setEditable(true);
            jTextField1.setBackground(Color.white);
        }
        else if (jComboBox1.getModel().getSelectedItem() == "Fitoterápico"){
            clear();
            jPanel4.setVisible(false);
            jPanel8.setVisible(false);
            jTextArea1.setEditable(false);
            jTextArea1.setBackground(Color.LIGHT_GRAY);
            jLabel29.setVisible(false);
            jTextArea13.setVisible(false);
            jScrollPane14.setVisible(false);
            jLabel28.setVisible(false);
            jTextField13.setVisible(false);
            jTextField1.setEditable(true);
            jTextField1.setBackground(Color.white);
        }
        else if (jComboBox1.getModel().getSelectedItem() == "Homeopático"){
            clear();
            jLabel29.setVisible(true);
            jTextArea13.setVisible(true);
            jScrollPane14.setVisible(true);
            jTextArea1.setEditable(false);
            jTextArea1.setBackground(Color.LIGHT_GRAY);
            jPanel4.setVisible(false);
            jPanel8.setVisible(false);
            jLabel28.setVisible(false);
            jTextField13.setVisible(false);
            jTextField1.setEditable(true);
            jTextField1.setBackground(Color.white);
        }
        else if (jComboBox1.getModel().getSelectedItem() == "Manipulado"){
            clear();
            jLabel29.setVisible(true);
            jTextArea13.setVisible(true);
            jScrollPane14.setVisible(true);
            jLabel28.setVisible(true);
            jTextField13.setVisible(true);
            jPanel4.setVisible(false);
            jPanel8.setVisible(false);
            jTextArea1.setEditable(true);
            jTextArea1.setBackground(Color.white);
            jTextField1.setEditable(true);
            jTextField1.setBackground(Color.white);
        }
        else if (jComboBox1.getModel().getSelectedItem() == "Referência"){
            clear();
            jPanel8.setVisible(true);
            jPanel4.setVisible(false);
            jTextArea1.setEditable(true);
            jTextArea1.setBackground(Color.white);
            jLabel29.setVisible(false);
            jTextArea13.setVisible(false);
            jScrollPane14.setVisible(false);
            jLabel28.setVisible(false);
            jTextField13.setVisible(false);
            jTextField1.setEditable(true);
            jTextField1.setBackground(Color.white);
        }
        else if (jComboBox1.getModel().getSelectedItem() == "Selecione"){
            clear();
            jPanel4.setVisible(false);
            jPanel8.setVisible(false);
            jTextArea1.setEditable(true);
            jTextArea1.setBackground(Color.white);
            jLabel29.setVisible(false);
            jTextArea13.setVisible(false);
            jScrollPane14.setVisible(false);
            jLabel28.setVisible(false);
            jTextField13.setVisible(false);
            jTextField1.setEditable(true);
            jTextField1.setBackground(Color.white);
        }
        else{
            clear();
            jPanel4.setVisible(false);
            jPanel8.setVisible(false);
            jTextArea1.setEditable(true);
            jTextArea1.setBackground(Color.white);
            jLabel29.setVisible(false);
            jTextArea13.setVisible(false);
            jScrollPane14.setVisible(false);
            jLabel28.setVisible(false);
            jTextField13.setVisible(false);
            jTextField1.setEditable(true);
            jTextField1.setBackground(Color.white);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int codigo = i;
        String nomeMed = jTextField1.getText();
        String princAtiv = jTextField2.getText();
        String preco = jTextField3.getText();
        String composicao = jTextArea1.getText();
        String info = jTextArea2.getText();
        String validade = jTextField4.getText();
        String indicacoes = jTextArea3.getText();
        String contraIndicacoes = jTextArea4.getText();
        String precaucoes = jTextArea5.getText();
        String interacoes = jTextArea6.getText();
        String reacoesAdversas = jTextArea7.getText();
        String posologia = jTextArea8.getText();
        String superdosagem = jTextArea9.getText();
        String infoadd = jTextArea10.getText();
        String infoPaciente = jTextArea13.getText();
        String farmManip = jTextField13.getText();
        String referencia = jTextField9.getText();
        String statusPatente = jTextField12.getText();
        
        double precoL = Double.parseDouble(preco);

        if (jComboBox1.getModel().getSelectedItem() == "Similar"){
            MedicamentoSimilar s = new MedicamentoSimilar(codigo, nomeMed, princAtiv, composicao, precoL, info, validade, indicacoes, contraIndicacoes, precaucoes, interacoes, reacoesAdversas, posologia, superdosagem, infoadd, referencia);
            listaMedicamentoSimilar.add (s);
            flag.add(i);
        }
        else if (jComboBox1.getModel().getSelectedItem() == "Genérico"){
            MedicamentoGenerico g = new MedicamentoGenerico(codigo, nomeMed, princAtiv, composicao, precoL, info, validade, indicacoes, contraIndicacoes, precaucoes, interacoes, reacoesAdversas, posologia, superdosagem, infoadd, referencia);
            listaMedicamentoGenerico.add (g);
            flag.add(i);
        }
        else if (jComboBox1.getModel().getSelectedItem() == "Alopático"){
            MedicamentoAlopatico a = new MedicamentoAlopatico(codigo, nomeMed, princAtiv, composicao, precoL, info, validade, indicacoes, contraIndicacoes, precaucoes, interacoes, reacoesAdversas, posologia, superdosagem, infoadd);
            listaMedicamentoAlopatico.add (a);
            flag.add(i);
        }
        else if (jComboBox1.getModel().getSelectedItem() == "Fitoterápico"){
            MedicamentoFitoterapico f = new MedicamentoFitoterapico(codigo, nomeMed, princAtiv, composicao, precoL, info, validade, indicacoes, contraIndicacoes, precaucoes, interacoes, reacoesAdversas, posologia, superdosagem, infoadd);
            listaMedicamentoFitoterapico.add (f);
            listaMedicamentoDinamizado.add (f);
            flag.add(i);
        }
        else if (jComboBox1.getModel().getSelectedItem() == "Homeopático"){
            MedicamentoHomeopatico h = new MedicamentoHomeopatico(codigo, nomeMed, princAtiv, composicao, precoL, info, validade, indicacoes, contraIndicacoes, precaucoes, interacoes, reacoesAdversas, posologia, superdosagem, infoadd, infoPaciente);
            listaMedicamentoHomeopatico.add (h);
            listaMedicamentoDinamizado.add (h);
            flag.add(i);
        }
        else if (jComboBox1.getModel().getSelectedItem() == "Manipulado"){
            MedicamentoManipulado m = new MedicamentoManipulado(codigo, nomeMed, princAtiv, composicao, precoL, info, validade, indicacoes, contraIndicacoes, precaucoes, interacoes, reacoesAdversas, posologia, superdosagem, infoadd, farmManip, infoPaciente);
            listaMedicamentoManipulado.add (m);
            flag.add(i);
        }
        else if (jComboBox1.getModel().getSelectedItem() == "Referência"){
            MedicamentoReferencia r = new MedicamentoReferencia(codigo, nomeMed, princAtiv, composicao, precoL, info, validade, indicacoes, contraIndicacoes, precaucoes, interacoes, reacoesAdversas, posologia, superdosagem, infoadd, statusPatente);
            listaMedicamentoReferencia.add (r);
            flag.add(i);
        }
        else if (jComboBox1.getModel().getSelectedItem() == "Selecione"){
            JOptionPane.showMessageDialog(null, "Selecione o Tipo do Medicamento!");
        }
        
        if (jComboBox1.getModel().getSelectedItem() != "Selecione"){
            JOptionPane.showMessageDialog(null, "Medicamento Cadastrado com Sucesso!");
            clear();
            i++;
            numAuto();
        }                       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jTextArea14.setText("");
        String aux = jTextArea14.getText();
        for(int i=0; i<=listaMedicamentoManipulado.size() ; i++){
            jTextArea14.setText(aux+listaMedicamentoManipulado.get(i).toString());
            aux = jTextArea14.getText();
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTextArea14.setText("");
        String aux = jTextArea14.getText();
        for(int i=0; i<=listaMedicamentoAlopatico.size() ; i++){
            jTextArea14.setText(aux+listaMedicamentoAlopatico.get(i).toString());
            aux = jTextArea14.getText();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jTextArea14.setText("");
        String aux = jTextArea14.getText();
        for(int i=0; i<=listaMedicamentoFitoterapico.size() ; i++){
            jTextArea14.setText(aux+listaMedicamentoFitoterapico.get(i).toString());
            aux = jTextArea14.getText();
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jTextArea14.setText("");
        String aux = jTextArea14.getText();
        for(int i=0; i<=listaMedicamentoHomeopatico.size() ; i++){
            jTextArea14.setText(aux+listaMedicamentoHomeopatico.get(i).toString());
            aux = jTextArea14.getText();
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jTextArea14.setText("");
        String aux = jTextArea14.getText();
        for(int i=0; i<=listaMedicamentoReferencia.size() ; i++){
            jTextArea14.setText(aux+listaMedicamentoReferencia.get(i).toString());
            aux = jTextArea14.getText();
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jTextArea14.setText("");
        String aux = jTextArea14.getText();
        for(int i=0; i<=listaMedicamentoGenerico.size() ; i++){
            jTextArea14.setText(aux+listaMedicamentoGenerico.get(i).toString());
            aux = jTextArea14.getText();
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jTextArea14.setText("");
        String aux = jTextArea14.getText();
        for(int i=0; i<=listaMedicamentoSimilar.size() ; i++){
            jTextArea14.setText(aux+listaMedicamentoSimilar.get(i).toString());
            aux = jTextArea14.getText();
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jTextArea14.setText("");
        String aux = jTextArea14.getText();
        for(int i=0; i<=listaMedicamentoDinamizado.size() ; i++){
            jTextArea14.setText(aux+listaMedicamentoDinamizado.get(i).toString());
            aux = jTextArea14.getText();
        }
    }//GEN-LAST:event_jButton17ActionPerformed
    
    int i=1;        
    private void numAuto(){
        jTextField5.setText(Integer.toString(i));
    }
    private void clear(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextArea1.setText("");
        jTextArea2.setText("");
        jTextField4.setText("");
        jTextArea3.setText("");
        jTextArea4.setText("");
        jTextArea5.setText("");
        jTextArea6.setText("");
        jTextArea7.setText("");
        jTextArea8.setText("");
        jTextArea9.setText("");
        jTextArea10.setText("");
        jTextField9.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextArea13.setText("");
    }
    
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea14;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
