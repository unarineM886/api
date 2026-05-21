package za.co.WebServices;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import za.co.VenLinkWeb.Support.Print;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Servlet implementation class NetcashPostbackServlet
 */
@WebServlet("/NetcashPostbackServlet")
public class NetcashPostbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NetcashPostbackServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		new Print("NETCASH POSTBACK.........");
		
		// 1. Read raw tab-delimited data from the request body
        StringBuilder buffer = new StringBuilder();
        try (BufferedReader reader = request.getReader()) {
            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line).append("\n");
            }
        }

        String rawData = buffer.toString();
        new Print("Raw_Data: " +rawData);

        // 2. Delegate to your shared Maven Project logic
        // Use a background thread or @Async if processing takes > 5 seconds
        boolean success = /*NetcashProcessor.handle(rawData)*/true;

        // 3. Mandatory Handshake: Netcash requires "OK" to stop retries
        response.setContentType("text/plain");
        if (success) {
            response.getWriter().write("OK");
            new Print("OK Sent bakc........");
        
        } else {
            // Sending anything other than OK (or a 500 error) triggers Netcash's retry logic
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }
}