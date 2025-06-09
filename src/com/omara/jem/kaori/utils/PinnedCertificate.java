package com.omara.jem.kaori.utils;

import javax.net.ssl.*;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public class PinnedCertificate {

    private static final String CERTIFICATE_FILE = "src/com/omara/jem/kaori/utils/certificate.pem"; // your PEM certificate

    public static SSLSocketFactory getPinnedSSLSocketFactory() throws Exception {
        CertificateFactory cf = CertificateFactory.getInstance("X.509");
        InputStream caInput = new java.io.FileInputStream(CERTIFICATE_FILE);
        X509Certificate caCert = (X509Certificate) cf.generateCertificate(caInput);
        caInput.close();

        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        keyStore.setCertificateEntry("caCert", caCert);

        TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        tmf.init(keyStore);

        SSLContext context = SSLContext.getInstance("TLS");
        context.init(null, tmf.getTrustManagers(), null);
        return context.getSocketFactory();
    }
}
