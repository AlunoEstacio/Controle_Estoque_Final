package main;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import static com.itextpdf.text.pdf.PdfDictionary.FONT;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import controle.ControleCliente;
import controle.ControleFuncionario;
import controle.ControleLogin;
import controle.ControlePedidoCompra;
import controle.ControlePedidoVenda;
import controle.ControleProduto;
import dao.FuncionarioDAO;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;
import modelo.Fornecedor;
import modelo.Funcionario;
import modelo.PedidoCompra;
import modelo.PedidoVProduto;
import modelo.PedidoVenda;
import modelo.Produto;
import org.apache.commons.mail.EmailException;
import relatorios.RelatorioCliente;
import relatorios.RelatorioPedidoCompra;
import relatorios.RelatorioPedidoVenda;
import relatorios.RelatorioProduto;
import servico.ServicoFuncionario;
import util.CriarPasta;
import util.EnviarEmail;
import util.ValidarCNPJ;
import util.ValidarData;
import visual.VisualCadastrarPedidoCompra;
import visual.VisualLogin;
import visual.VisualPrincipal;
import visual.VisualVisualizarCliente;

public class Controle_Estoque {

	public static void main(String[] args) throws EmailException, ParseException {
            /*VisualLogin vl = new VisualLogin();
            vl.setVisible(true);
            VisualPrincipal vs = new VisualPrincipal();
            vs.setVisible(true);
            
            Funcionario f = new Funcionario();
            f.setNome("Rafael alves");
            f.setCargo("Gerente");
            f.setCpf(074657467);
            
            ControleCliente cf = new ControleCliente();
            List<Cliente> lf = cf.selecionarTodosClientes();
            
            RelatorioCliente.gerarPdf(lf, f);
            
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date inicio = formato.parse("01/01/2017");
            Date fim = formato.parse("30/10/2017");
            
            Funcionario f = new Funcionario();
            f.setNome("Rafael alves");
            f.setCargo("Gerente");
            f.setCpf(074657467);
            
            ControleCliente cpv = new ControleCliente();
            List<Cliente> pc = cpv.selecionarTodosClientes();
            
            RelatorioCliente.gerarPdf(pc, f);
            
            */
            //2000-05-20
            
            VisualLogin vl = new VisualLogin();
            vl.setVisible(true);
        }
        
    
}
