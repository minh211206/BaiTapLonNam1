/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Grade;
import model.GradeDAO;
import model.SinhVienDAO;
import model.SinhVien;

/**
 *
 * @author ADMIN
 */
public class QuanLiDiemView extends javax.swing.JFrame {
    SinhVienDAO svDAO = new SinhVienDAO();
    GradeDAO dDAO = new GradeDAO();
    int index = 0;

    /**
     * Creates new form QuanLiDiemView
     */
    public QuanLiDiemView() {
        initComponents();
        setLocationRelativeTo(null);
        txtMaSV.setEditable(false);// k cho sửa masv chỉ sửa điểm
        txtTenSV.setEditable(false);// k cho sửa tên chỉ sửa điểm
        fillDataTBALE();
    }



    
    public void fillDataTBALE(){
        DefaultTableModel model = (DefaultTableModel)tbDiem.getModel();
        model.setRowCount(0);
        for (Grade g : dDAO.getAllGrade()) {
            Object rowData[] = new Object[7];
            rowData[0] = g.getSv().getMaSV();
            rowData[1] = g.getSv().getTenSv();
            rowData[2] = g.getAnhVan();
            rowData[3] = g.getTinHoc();
            rowData[4] = g.getGdtc();
            String tb = String.format("%.2f", g.getTBC());
            rowData[5] = tb;
            rowData[6] = g.getXepLoai();
            model.addRow(rowData);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTBC = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenSV = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAnhVan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTinHoc = new javax.swing.JTextField();
        txtGDTC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnLuu = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDiem = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtFindMaSV = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnFirst = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTBC.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTBC.setText("0.0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("HỌ VÀ TÊN:");

        txtTenSV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTenSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSVActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("ANH VĂN:");

        txtAnhVan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAnhVan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnhVanActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("TIN HỌC:");

        txtTinHoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTinHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTinHocActionPerformed(evt);
            }
        });

        txtGDTC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGDTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGDTCActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("GDTC:");

        btnLuu.setIcon(new javax.swing.ImageIcon("D:\\Hinh\\Hinh\\Save.png")); // NOI18N
        btnLuu.setText("LƯU");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon("D:\\Hinh\\Hinh\\Notes.png")); // NOI18N
        btnSua.setText("SỬA");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon("D:\\Hinh\\Hinh\\Delete.png")); // NOI18N
        btnXoa.setText("XÓA");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        tbDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MÃ SV", "TÊN SV", "ANH VĂN", "TIN HỌC", "GDTC", "TBC", "XẾP LOẠI"
            }
        ));
        tbDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDiemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDiem);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("MÃ SINH VIÊN:");

        txtFindMaSV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFindMaSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFindMaSVActionPerformed(evt);
            }
        });

        btnTimKiem.setIcon(new javax.swing.ImageIcon("D:\\Hinh\\Hinh\\Search.png")); // NOI18N
        btnTimKiem.setText("TÌM KIẾM");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtFindMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnTimKiem)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFindMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("MÃ SINH VIÊN:");

        txtMaSV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMaSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSVActionPerformed(evt);
            }
        });

        btnThem.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Pictures\\Screenshots\\Create.png")); // NOI18N
        btnThem.setText("THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("ĐIỂM TRUNG BÌNH:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("QUẢN LÍ ĐIỂM");

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnBack.setText("<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Pictures\\Screenshots\\back.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(lblTBC)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtAnhVan, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtTinHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtGDTC, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(161, 161, 161)
                        .addComponent(jLabel2)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2))
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(txtAnhVan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtTinHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtGDTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))
                    .addComponent(lblTBC))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFirst)
                    .addComponent(btnBack)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFindMaSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindMaSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFindMaSVActionPerformed

    private void txtTenSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSVActionPerformed

    private void txtAnhVanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnhVanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnhVanActionPerformed

    private void txtTinHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTinHocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTinHocActionPerformed

    private void txtGDTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGDTCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGDTCActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
       if(txtFindMaSV.getText().isEmpty()){
           JOptionPane.showMessageDialog(this,"Bạn chưa nhập mã sinh viên");
       }else{
            SinhVien sv = svDAO.getSinhVienByID(txtFindMaSV.getText());
            if(sv !=null){
                Grade d = dDAO.getOneGradeByMaSV(sv.getMaSV());
                if(d !=null){
                    setModel(d);
                }else {
                txtMaSV.setText(sv.getMaSV());
                txtTenSV.setText(sv.getTenSv());
                txtAnhVan.setText("-1");
                txtGDTC.setText("-1");
                txtTinHoc.setText("-1");
                lblTBC.setText("0.0");
            }
       }
    }//GEN-LAST:event_btnTimKiemActionPerformed
   }
    public boolean validateForm(){
        if(txtMaSV.getText().isEmpty() 
                || txtTenSV.getText().isEmpty()
                || txtAnhVan.getText().isEmpty()
                || txtTinHoc.getText().isEmpty()
                || txtGDTC.getText().isEmpty()){
            return false;
        }else {
            try {
                double av = Double.parseDouble(txtAnhVan.getText());
                double th = Double.parseDouble(txtTinHoc.getText());
                double gdtc = Double.parseDouble(txtGDTC.getText());
            if(av <0 || av > 10){
                return false;
            }else if(th<0 || th>10){
                return false;
            }else if(gdtc<0 || gdtc > 10){
                return false;
            }
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
    
    public Grade getModel(){
        Grade g = new Grade();
        g.setId(0);
        SinhVien sv = new SinhVien(txtMaSV.getText(),txtTenSV.getText());
        g.setSv(sv);
        g.setAnhVan(Double.parseDouble(txtAnhVan.getText()));
        g.setTinHoc(Double.parseDouble(txtTinHoc.getText()));
        g.setGdtc(Double.parseDouble(txtGDTC.getText()));
        return g;
    }
    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        if(validateForm()){
            Grade g = getModel();
            if(dDAO.getOneGradeByMaSV(g.getSv().getMaSV())!= null){
                JOptionPane.showMessageDialog(this, "Mã sinh viên này đã tồn tại");
            }else{
                if(dDAO.add(g) >0){
                   fillDataTBALE();
                }
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Xin vui lòng kiểm tra thông tin");
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if(validateForm()){
            Grade d = getModel();
            if(dDAO.updateGrade(d)> 0){
                JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                fillDataTBALE();
            }
        }else {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập thông tin");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here
       if(validateForm()){
            Grade d = getModel();
            if(dDAO.delGrade(txtMaSV.getText())> 0){
                JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                fillDataTBALE();
            }
        }else {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập thông tin");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void txtMaSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSVActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    public void setModel(Grade g){
        txtAnhVan.setText(String.valueOf(g.getAnhVan()));
        txtTinHoc.setText(String.valueOf(g.getTinHoc()));
        txtGDTC.setText(String.valueOf(g.getGdtc()));
        txtMaSV.setText(g.getSv().getMaSV());
        txtTenSV.setText(g.getSv().getTenSv());
        String tb = String.format("%.2f", g.getTBC());
        lblTBC.setText(tb);
    }
    private void tbDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDiemMouseClicked
        // TODO add your handling code here:
        index = tbDiem.rowAtPoint(evt.getPoint());
        Grade g = getGradeAtPosition(index);
        setModel(g);
    }//GEN-LAST:event_tbDiemMouseClicked

        public Grade getGradeAtPosition(int pos){
        Grade g = new Grade();
        SinhVien sv = new SinhVien();
        sv.setMaSV(tbDiem.getValueAt(pos, 0).toString());
        sv.setTenSv(tbDiem.getValueAt(pos, 1).toString());
        g.setSv(sv);
        g.setAnhVan(Double.parseDouble(tbDiem.getValueAt(pos, 2).toString()));
        g.setTinHoc(Double.parseDouble(tbDiem.getValueAt(pos, 3).toString()));
        g.setGdtc(Double.parseDouble(tbDiem.getValueAt(pos, 4).toString()));
        return g;
    }
        
    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        index = 0;
        Grade g = getGradeAtPosition(index);
        setModel(g);
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
       index --;
       if(index<= 0){
           index = 0;
       }
        Grade g = getGradeAtPosition(index);
        setModel(g);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        index ++;
        if(index>=dDAO.getAllGrade().size() -1){
            index = dDAO.getAllGrade().size() -1;
        }
        Grade g = getGradeAtPosition(index);
        setModel(g);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        index = dDAO.getAllGrade().size()-1;
        Grade g = getGradeAtPosition(index);
        setModel(g);
    }//GEN-LAST:event_btnLastActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new FrMainFrom().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(QuanLiDiemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLiDiemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLiDiemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLiDiemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLiDiemView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTBC;
    private javax.swing.JTable tbDiem;
    private javax.swing.JTextField txtAnhVan;
    private javax.swing.JTextField txtFindMaSV;
    private javax.swing.JTextField txtGDTC;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtTenSV;
    private javax.swing.JTextField txtTinHoc;
    // End of variables declaration//GEN-END:variables
}
