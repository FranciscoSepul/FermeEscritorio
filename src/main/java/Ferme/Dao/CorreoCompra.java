package Ferme.Dao;

public class CorreoCompra {

    public String correoTotal(String correo, int total, String nombreProd) {

        String cuerpo = " \n"
                + "<!DOCTYPE html>    \n"
                + "<html>    \n"
                + "<head>\n"
                + "  \n"
                + "</head>    \n"
                + "<body marginheight=0 marginwidth=0 topmargin=0 leftmargin=0 style=\"height: 100% !important; margin: 0; padding: 0; width: 100% !important;min-width: 100%;\">    \n"
                + "    \n"
                + "<table name=\"bmeMainContent\" style=\"border-radius: 0px; border-collapse: separate; border-spacing: 0px; border: 0px none transparent; overflow: visible;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\"> <tbody><tr><td width=\"100%\" class=\"blk_container bmeHolder\" name=\"bmeHeader\" valign=\"top\" align=\"center\" style=\"border: 0px none transparent; background-color: rgb(255, 255, 255);\" bgcolor=\"#ffffff\"><div id=\"dv_9\" class=\"blk_wrapper\">    \n"
                + "<table width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" class=\"blk\" name=\"blk_divider\" style=\"\"><tbody><tr><td class=\"tblCellMain\" style=\"padding: 10px 20px;\">    \n"
                + "\n"
                + "<table class=\"tblLine\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\" style=\"border-top-width: 0px; border-top-style: none; min-width: 1px;\"><tbody><tr><td><span></span></td></tr></tbody>    \n"
                + "</table></td></tr></tbody>   \n"
                + "</table></div><div id=\"dv_1\" class=\"blk_wrapper\">    \n"
                + "<table width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" class=\"blk\" name=\"blk_image\"><tbody><tr><td>    \n"
                + "<table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\"><tbody><tr><td align=\"center\" class=\"bmeImage\" style=\"border-collapse: collapse; padding: 10px 0px;\"><img    \n"
                + " src=\"https://i.postimg.cc/1XzkVFSp/FERME-Logo.png\" class=\"mobile-img-large\" width=\"600\" style=\"max-width: 1200px; display: block; width: 600px;\" alt=\"\" border=\"0\"></td></tr></tbody>    \n"
                + "</table></td></tr></tbody>    \n"
                + "</table></div><div id=\"dv_11\" class=\"blk_wrapper\">    \n"
                + "<table width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" class=\"blk\" name=\"blk_divider\" style=\"\"><tbody><tr><td class=\"tblCellMain\" style=\"padding: 20px;\">    \n"
                + "<table class=\"tblLine\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\" style=\"border-top-width: 0px; border-top-style: none; min-width: 1px;\"><tbody><tr><td><span></span></td></tr></tbody>    \n"
                + "</table></td></tr></tbody>    \n"
                + "</table></div>\n"
                + "</td></tr> <tr><td width=\"100%\" class=\"blk_container bmeHolder bmeBody\" name=\"bmeBody\" valign=\"top\" align=\"center\" style=\"color: rgb(56, 56, 56); border: 0px none transparent; background-color: rgb(255, 255, 255);\" bgcolor=\"#ffffff\"><div id=\"dv_13\" class=\"blk_wrapper\">    \n"
                + "<table width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" class=\"blk\" name=\"blk_divider\" style=\"\"><tbody><tr><td class=\"tblCellMain\" style=\"padding: 15px 20px;\">    \n"
                + "<table class=\"tblLine\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\" style=\"border-top-width: 0px; border-top-style: none; min-width: 1px;\"><tbody><tr><td><span></span></td></tr></tbody>    \n"
                + "</table></td></tr></tbody>    \n"
                + "</table></div><div id=\"dv_12\" class=\"blk_wrapper\">    \n"
                + "<table width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" class=\"blk\" name=\"blk_button\" style=\"\"><tbody><tr><td width=\"20\"></td><td align=\"center\">    \n"
                + "<table class=\"tblContainer\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\"><tbody><tr><td height=\"20\"></td></tr><tr><td align=\"center\">    \n"
                + "<table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" class=\"bmeButton\" align=\"center\" style=\"border-collapse: separate;\"><tbody><tr><td style=\"border-radius: 0px; border: 1px solid rgb(69, 153, 232); text-align: center; font-family: Arial, Helvetica, sans-serif; font-size: 14px; padding: 15px 40px; font-weight: normal; border-collapse: separate;\" class=\"bmeButtonText\"><span style=\"font-family: 'Arial Narrow', 'Arial MT Condensed Light', sans-serif; font-size: 24px; color: rgb(255, 251, 255);\">    \n"
                + "<a style=\"color: rgb(0, 0, 0); text-decoration: none;\" target=\"_blank\">Boleta </a></span></td></tr></tbody>    \n"
                + "</table></td></tr><tr><td height=\"20\"></td></tr></tbody>    \n"
                + "</table></td><td width=\"20\"></td></tr></tbody>    \n"
                + "</table></div><div id=\"dv_14\" class=\"blk_wrapper\">    \n"
                + "<table width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" class=\"blk\" name=\"blk_text\"><tbody><tr><td>    \n"
                + "<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"100%\" class=\"bmeContainerRow\"><tbody><tr><td class=\"tdPart\" valign=\"top\" align=\"center\">    \n"
                + "<table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"600\" name=\"tblText\" style=\"float:left; background-color:transparent;\" align=\"left\" class=\"tblText\"><tbody><tr><td valign=\"top\" align=\"left\" name=\"tblCell\" style=\"padding: 10px 20px; font-family: Arial, Helvetica, sans-serif; font-size: 14px; font-weight: 400; color: rgb(56, 56, 56); text-align: left;\" class=\"tblCell\"><div style=\"line-height: 200%; text-align: center;\"><span style=\"font-size: 14px; font-family: Arial, Helvetica, sans-serif; color: #000000; line-height: 200%;\">Hola Esperando que tengas un buen dia laboral a continuacion te hacemos envio del total. Saludos</span></div></td></tr></tbody>    \n"
                + "<table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"600\" name=\"tblText\" style=\"float:left; background-color:transparent;\" align=\"left\" class=\"tblText\"><tbody><tr><td valign=\"top\" align=\"left\" name=\"tblCell\" style=\"padding: 10px 20px; font-family: Arial, Helvetica, sans-serif; font-size: 14px; font-weight: 400; color: rgb(56, 56, 56); text-align: left;\" class=\"tblCell\"><div style=\"line-height: 200%; text-align: center;\"><span style=\"font-size: 14px; font-family: Arial, Helvetica, sans-serif; color: #000000; line-height: 200%;\">Producto: </span></div></td></tr></tbody \n"               
                + "\n <H1 align=\"center\"> " + total + "</H1>"
                + "</table></td></tr><tr><td height=\"20\"></td></tr></tbody>    \n"
                + "</table></td><td width=\"20\"></td></tr></tbody>    \n"
                + "</table></div>\n"
                + "</td></tr> <tr><td width=\"100%\" class=\"blk_container bmeHolder\" name=\"bmePreFooter\" valign=\"top\" align=\"center\" style=\"border: 0px none transparent; background-color: rgb(255, 255, 255);\" bgcolor=\"#ffffff\">\n"
                + "<div id=\"dv_4\" class=\"blk_wrapper\">    \n"
                + "<table width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" class=\"blk\" name=\"blk_divider\" style=\"\"><tbody><tr><td class=\"tblCellMain\" style=\"padding: 30px 20px;\">    \n"
                + "<table class=\"tblLine\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\" style=\"border-top-width: 0px; border-top-style: none; min-width: 1px;\"><tbody><tr><td><span></span></td></tr></tbody>    \n"
                + "\n"
                + "</table></div><div id=\"dv_7\" class=\"blk_wrapper\">    \n"
                + "<table width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" class=\"blk\" name=\"blk_footer\" style=\"\"><tbody><tr><td name=\"tblCell\" class=\"tblCell\" style=\"padding:20px;\" valign=\"top\" align=\"left\">    \n"
                + "<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"100%\"><tbody><tr><td name=\"bmeBadgeText\" style=\"text-align:left; word-break: break-word;\" align=\"left\"><span id=\"spnFooterText\" style=\"font-family: Arial, Helvetica, sans-serif; font-weight: normal; font-size: 11px; line-height: 140%;\">Este mensaje de correo electrónico fue enviado a " + correo + " , por equipoferme2020@gmail.com |\n"
                + "	<br>Ferreteria Ferme | Calle Falsa 123 | Santiago | Santiago | Chile </span>    \n"
                + "<br>    ";

        return cuerpo;
    }
}
