/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-07-01 14:53:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import model.ProdottoBean;
import model.ProdottoDAO;
import model.OrdineDao;
import model.OrdineBean;
import java.util.List;

public final class adminArea_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(6);
    _jspx_imports_classes.add("java.sql.SQLException");
    _jspx_imports_classes.add("model.ProdottoBean");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("model.ProdottoDAO");
    _jspx_imports_classes.add("model.OrdineBean");
    _jspx_imports_classes.add("model.OrdineDao");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html class=\"no-js\" lang=\"zxx\">\r\n");
      out.write("\r\n");
 
if(request.getSession().getAttribute("admin") != Boolean.TRUE)
	response.sendRedirect("catalogo?mode=home");

// Inizializza la lista dei prodotti solo se non è già presente nella sessione
List<ProdottoBean> prodotti = (List<ProdottoBean>) session.getAttribute("prodotti");
if (prodotti == null) {
    ProdottoDAO prodottoDAO = new ProdottoDAO();
    try {
        prodotti = prodottoDAO.doRetrieveAll("id");
        session.setAttribute("prodotti", prodotti);
    } catch (SQLException e) {
        e.printStackTrace();
        request.setAttribute("errorMessage", "Errore nel recupero dei prodotti");
    }
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"meta description\">\r\n");
      out.write("\r\n");
      out.write("    <title>Area utente</title>\r\n");
      out.write("\r\n");
      out.write("    <!--=== Favicon ===-->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"assets/img/logo.png\" type=\"image/x-icon\"/>\r\n");
      out.write("\r\n");
      out.write("    <!--== Google Fonts ==-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("          href=\"https://fonts.googleapis.com/css?family=Droid+Serif:400,400i,700,700i\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("          href=\"https://fonts.googleapis.com/css?family=Playfair+Display:400,400i,700,700i\"/>\r\n");
      out.write("\r\n");
      out.write("    <!--=== Bootstrap CSS ===-->\r\n");
      out.write("    <link href=\"assets/css/vendor/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!--=== Font-Awesome CSS ===-->\r\n");
      out.write("    <link href=\"assets/css/vendor/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!--=== Plugins CSS ===-->\r\n");
      out.write("    <link href=\"assets/css/plugins.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!--=== Main Style CSS ===-->\r\n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Modernizer JS -->\r\n");
      out.write("    <script src=\"assets/js/vendor/modernizr-2.8.3.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "fragments/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--== Page Title Area Start ==-->\r\n");
      out.write("<div id=\"page-title-area\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-12 text-center\">\r\n");
      out.write("                <div class=\"page-title-content\">\r\n");
      out.write("                    <h1>Area Utente</h1>\r\n");
      out.write("                    <ul class=\"breadcrumb\">\r\n");
      out.write("                        <li><a href=\"homePage.jsp\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"memberArea.jsp\" class=\"active\">Area Utente</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--== Page Title Area End ==-->\r\n");
      out.write("\r\n");
      out.write("<!--== Page Content Wrapper Start ==-->\r\n");
      out.write("<div id=\"page-content-wrapper\" class=\"p-9\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-lg-12\">\r\n");
      out.write("                <!-- My Account Page Start -->\r\n");
      out.write("                <div class=\"myaccount-page-wrapper\">\r\n");
      out.write("                    <!-- My Account Tab Menu Start -->\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-3\">\r\n");
      out.write("                            <div class=\"myaccount-tab-menu nav\" role=\"tablist\">\r\n");
      out.write("                                <a href=\"#dashboad\" class=\"active\" data-toggle=\"tab\"><i class=\"fa fa-dashboard\"></i> Area Utente</a>\r\n");
      out.write("\r\n");
      out.write("                                <a href=\"#orders\" data-toggle=\"tab\"><i class=\"fa fa-cart-arrow-down\"></i>Gestisci Ordini</a>\r\n");
      out.write("\r\n");
      out.write("                                <a href=\"#products\" data-toggle=\"tab\"><i class=\"fa fa-map-marker\"></i>Gestisci Prodotti</a>\r\n");
      out.write("\r\n");
      out.write("                 \r\n");
      out.write("                                <a href=\"LogOutServlet\"><i class=\"fa fa-sign-out\"></i> Logout</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                  	<!-- My Account Tab Menu End -->\r\n");
      out.write("\r\n");
      out.write("                 <!-- My Account Tab Content Start -->\r\n");
      out.write("                 <div class=\"col-lg-9 mt-5 mt-lg-0\">\r\n");
      out.write("                          <div class=\"tab-content\" id=\"myaccountContent\">\r\n");
      out.write("                            <!-- Single Tab Content Start -->\r\n");
      out.write("                            <div class=\"tab-pane fade show active\" id=\"dashboad\" role=\"tabpanel\">\r\n");
      out.write("                                <div class=\"myaccount-content\">\r\n");
      out.write("                                    <h3>Area Utente</h3>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"welcome\">\r\n");
      out.write("                                    <p>\r\n");
      out.write("                                    ");

									Boolean isLoggedIn = (Boolean) session.getAttribute("logged");
							        if (isLoggedIn != null && isLoggedIn) {
							            String nome = (String) session.getAttribute("nome");
							            String cognome = (String) session.getAttribute("cognome");
							            out.println("<p>Bentornato, " + nome + " " + cognome + "!</p>");
							        } else {
							            out.println("<p>Perfavore <a href='loginPage.jsp'>login</a> per continuare.</p>");
							        }
			
									
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                     <p class=\"mb-0\">Dalla dashboard del tuo account. puoi facilmente controllare e visualizzare il tuo\r\n");
      out.write("                                        ordini recenti, gestisci i tuoi indirizzi di spedizione e fatturazione e modifica i tuoi\r\n");
      out.write("                                        password e dettagli dell'account.\r\n");
      out.write("                                     </p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                     \r\n");
      out.write("					 <!-- Single Tab Content End -->\r\n");
      out.write("				 	 <div class=\"tab-pane fade\" id=\"orders\" role=\"tabpanel\">\r\n");
      out.write("							<div class=\"myaccount-content\">\r\n");
      out.write("								        <h3>Gestisci Ordini</h3>\r\n");
      out.write("								\r\n");
      out.write("								        <!-- Form per inserire l'email e intervallo di date -->\r\n");
      out.write("								        <form action=\"adminArea.jsp#orders\" method=\"GET\">\r\n");
      out.write("								            <div class=\"form-group\">\r\n");
      out.write("								                <label for=\"inputEmail\">Inserisci l'email:</label>\r\n");
      out.write("								                &nbsp&nbsp\r\n");
      out.write("								                <input type=\"text\" id=\"inputEmail\" name=\"email\">\r\n");
      out.write("								            </div>\r\n");
      out.write("								            <div class=\"form-group\">\r\n");
      out.write("								                <label for=\"inputDataInizio\">Data Inizio:</label>\r\n");
      out.write("								                &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\r\n");
      out.write("								                <input type=\"date\" id=\"inputDataInizio\" name=\"dataInizio\">\r\n");
      out.write("								            </div>\r\n");
      out.write("								            <div class=\"form-group\">\r\n");
      out.write("								                <label for=\"inputDataFine\">Data Fine:</label>\r\n");
      out.write("								                &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\r\n");
      out.write("								                <input type=\"date\" id=\"inputDataFine\" name=\"dataFine\">\r\n");
      out.write("								            </div>\r\n");
      out.write("								            <br><br>\r\n");
      out.write("								            <button type=\"submit\">Cerca ordini</button>\r\n");
      out.write("								            <button type=\"button\" onclick=\"resetFilters()\">Azzerare filtri</button>\r\n");
      out.write("								        </form>\r\n");
      out.write("								\r\n");
      out.write("								        <div class=\"myaccount-table table-responsive text-center\">\r\n");
      out.write("								            <table class=\"table table-bordered\">\r\n");
      out.write("								                <thead class=\"thead-light\">\r\n");
      out.write("								                    <tr>\r\n");
      out.write("								                        <th>ID</th>\r\n");
      out.write("								                        <th>Data</th>\r\n");
      out.write("								                        <th>Costo Totale</th>\r\n");
      out.write("								                        <th>Email Utente</th>\r\n");
      out.write("								                        <th>Dettagli</th>\r\n");
      out.write("								                    </tr>\r\n");
      out.write("								                </thead>\r\n");
      out.write("								                <tbody>\r\n");
      out.write("								                    ");
      out.write("\r\n");
      out.write("								                    ");

								                    OrdineDao ordineDAO = new OrdineDao();
								                    List<OrdineBean> ordini = null;
								
								                    String userEmail = request.getParameter("email");
								                    String dataInizio = request.getParameter("dataInizio");
								                    String dataFine = request.getParameter("dataFine");
								                    String reset = request.getParameter("reset");
								
								                    if (reset != null && reset.equals("true")) {
								                        // Azzeramento dei filtri, recupera tutti gli ordini
								                        try {
								                            ordini = ordineDAO.doRetrieveAll(null);
								                        } catch (Exception e) {
								                            out.println("Errore: " + e.getMessage());
								                        }
								                    } else if (userEmail != null && !userEmail.isEmpty()) {
								                        // Recupera gli ordini per email specificata
								                        try {
								                            ordini = ordineDAO.doRetrieveByEmail(userEmail);
								                        } catch (Exception e) {
								                            out.println("Errore: " + e.getMessage());
								                        }
								                    } else if (dataInizio != null && dataFine != null && !dataInizio.isEmpty() && !dataFine.isEmpty()) {
								                        // Recupera gli ordini per intervallo di date
								                        try {
								                            ordini = ordineDAO.doRetrieveByDateRange(dataInizio, dataFine);
								                        } catch (Exception e) {
								                            out.println("Errore: " + e.getMessage());
								                        }
								                    } else {
								                        // Recupera tutti gli ordini se non viene fornita un'email o un intervallo di date
								                        try {
								                            ordini = ordineDAO.doRetrieveAll(null);
								                        } catch (Exception e) {
								                            out.println("Errore: " + e.getMessage());
								                        }
								                    }
								
								                    if (ordini != null && !ordini.isEmpty()) {
								                        for (OrdineBean ordine : ordini) {
								                    
      out.write("\r\n");
      out.write("								                    <tr>\r\n");
      out.write("								                        <td>");
      out.print( ordine.getId() );
      out.write("</td>\r\n");
      out.write("								                        <td>");
      out.print( ordine.getData() );
      out.write("</td>\r\n");
      out.write("								                        <td>");
      out.print( ordine.getCostoTotale() );
      out.write("</td>\r\n");
      out.write("								                        <td>");
      out.print( ordine.getUtenteEmail() );
      out.write("</td>\r\n");
      out.write("								                        <td><a href=\"visualizzaOrdine.jsp?id=");
      out.print( ordine.getId());
      out.write("\" class=\"btn-add-to-cart\">Visualizza</a></td>\r\n");
      out.write("								                    </tr>\r\n");
      out.write("								                    ");

								                        }
								                    } else {
								                    
      out.write("\r\n");
      out.write("								                    <tr>\r\n");
      out.write("								                        <td colspan=\"5\">Nessun ordine trovato");
 if (userEmail != null && !userEmail.isEmpty()) out.print(" per l'email " + userEmail); 
      out.write(".</td>\r\n");
      out.write("								                    </tr>\r\n");
      out.write("								                    ");

								                    }
								                    
      out.write("\r\n");
      out.write("								                </tbody>\r\n");
      out.write("								            </table>\r\n");
      out.write("								        </div>\r\n");
      out.write("							</div>\r\n");
      out.write("					 </div>\r\n");
      out.write("\r\n");
      out.write("                     <!-- Single Tab Content End -->\r\n");
      out.write("\r\n");
      out.write("                  \r\n");
      out.write("                      \r\n");
      out.write("\r\n");
      out.write("                   \r\n");
      out.write("                    \r\n");
      out.write("                     <!-- Single Tab Content Start -->                       \r\n");
      out.write("					 <div class=\"tab-pane fade\" id=\"products\" role=\"tabpanel\">\r\n");
      out.write("									    <div class=\"myaccount-content\">\r\n");
      out.write("									        <h3>Gestisci Prodotti</h3>\r\n");
      out.write("									        \r\n");
      out.write("									        \r\n");
      out.write("									        <a href=\"aggiungiProdottoForm.jsp\" class=\"btn btn-primary mb-3\">Aggiungi Prodotto</a>\r\n");
      out.write("									        \r\n");
      out.write("									\r\n");
      out.write("									        <div class=\"myaccount-table table-responsive text-center\">\r\n");
      out.write("									            <table class=\"table table-bordered\">\r\n");
      out.write("									                <thead class=\"thead-light\">\r\n");
      out.write("									                    <tr>\r\n");
      out.write("									                        <th>ID</th>\r\n");
      out.write("									                        <th>Nome</th>\r\n");
      out.write("									                        <th>Quantità</th>\r\n");
      out.write("									                        <th>Costo</th>\r\n");
      out.write("									                        <th>Sesso</th>\r\n");
      out.write("									                        <th>Categoria</th>\r\n");
      out.write("									                        <th>Action</th>\r\n");
      out.write("									                    </tr>\r\n");
      out.write("									                </thead>\r\n");
      out.write("									                <tbody>\r\n");
      out.write("									                    ");
      out.write("\r\n");
      out.write("									                    ");

									                        ProdottoBean prodottoBean = new ProdottoBean();
									
									
									                        if (prodotti != null && !prodotti.isEmpty()) {
									                            for (ProdottoBean prodotto : prodotti) {
									                            	prodottoBean = prodotto;
									                    
      out.write("\r\n");
      out.write("									                    <tr>\r\n");
      out.write("									                        <td>");
      out.print( prodotto.getId() );
      out.write("</td>\r\n");
      out.write("									                        <td>");
      out.print( prodotto.getNome() );
      out.write("</td>\r\n");
      out.write("									                        <td>");
      out.print( prodotto.getQuantita() );
      out.write("</td>\r\n");
      out.write("									                        <td>");
      out.print( prodotto.getCosto() );
      out.write("</td>\r\n");
      out.write("									                        <td>");
      out.print( prodotto.getSesso() );
      out.write("</td>\r\n");
      out.write("									                        <td>");
      out.print( prodotto.getCategoriaNome() );
      out.write("</td>\r\n");
      out.write("									                        <td>\r\n");
      out.write("									                            <a href=\"modificaProdotto?mode=modifica&prodotto=");
 out.println(prodotto.getId());
      out.write("\" class=\"btn btn-info btn-sm\">Modifica</a>\r\n");
      out.write("									                            <a href=\"modificaProdotto?mode=elimina&prodotto=");
      out.print( prodottoBean.getId() );
      out.write("\" class=\"btn btn-danger btn-sm\">Elimina</a>\r\n");
      out.write("									                        </td>\r\n");
      out.write("									                    </tr>\r\n");
      out.write("									                    ");

									                            }
									                        } else {
									                    
      out.write("\r\n");
      out.write("									                    <tr>\r\n");
      out.write("									                        <td colspan=\"7\">Nessun prodotto trovato.</td>\r\n");
      out.write("									                    </tr>\r\n");
      out.write("									                    ");

									                        }
									                    
      out.write("\r\n");
      out.write("									                </tbody>\r\n");
      out.write("									            </table>\r\n");
      out.write("									        </div>\r\n");
      out.write("									    </div>\r\n");
      out.write("									</div>\r\n");
      out.write("\r\n");
      out.write("                     <!-- Single Tab Content End -->\r\n");
      out.write("                 </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 <!-- My Account Tab Content End -->\r\n");
      out.write("                </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- My Account Page End -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--== Page Content Wrapper End ==-->\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "fragments/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Scroll to Top Start -->\r\n");
      out.write("<a href=\"#\" class=\"scrolltotop\"><i class=\"fa fa-angle-up\"></i></a>\r\n");
      out.write("<!-- Scroll to Top End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--=======================Javascript============================-->\r\n");
      out.write("<!--=== Jquery Min Js ===-->\r\n");
      out.write("<script src=\"assets/js/vendor/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<!--=== Jquery Migrate Min Js ===-->\r\n");
      out.write("<script src=\"assets/js/vendor/jquery-migrate-1.4.1.min.js\"></script>\r\n");
      out.write("<!--=== Popper Min Js ===-->\r\n");
      out.write("<script src=\"assets/js/vendor/popper.min.js\"></script>\r\n");
      out.write("<!--=== Bootstrap Min Js ===-->\r\n");
      out.write("<script src=\"assets/js/vendor/bootstrap.min.js\"></script>\r\n");
      out.write("<!--=== Plugins Min Js ===-->\r\n");
      out.write("<script src=\"assets/js/plugins.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--=== Active Js ===-->\r\n");
      out.write("<script src=\"assets/js/active.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<script>\r\n");
      out.write("function resetFilters() {\r\n");
      out.write("    document.getElementById(\"inputEmail\").value = \"\";\r\n");
      out.write("    document.getElementById(\"inputDataInizio\").value = \"\";\r\n");
      out.write("    document.getElementById(\"inputDataFine\").value = \"\";\r\n");
      out.write("    // Aggiungi un parametro reset per azzerare i filtri\r\n");
      out.write("    var form = document.querySelector(\"form\");\r\n");
      out.write("    var inputReset = document.createElement(\"input\");\r\n");
      out.write("    inputReset.setAttribute(\"type\", \"hidden\");\r\n");
      out.write("    inputReset.setAttribute(\"name\", \"reset\");\r\n");
      out.write("    inputReset.setAttribute(\"value\", \"true\");\r\n");
      out.write("    form.appendChild(inputReset);\r\n");
      out.write("    form.submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}