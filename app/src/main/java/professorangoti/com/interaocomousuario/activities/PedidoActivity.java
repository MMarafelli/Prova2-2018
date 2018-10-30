package professorangoti.com.interaocomousuario.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import professorangoti.com.interaocomousuario.R;
import professorangoti.com.interaocomousuario.model.Pedido;

public class PedidoActivity extends AppCompatActivity {

    private TextView precoPedidoTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        precoPedidoTela = findViewById(R.id.textViewPreco);

        Bundle bundle = getIntent().getExtras();
        Pedido pedido = null;

        if (bundle != null) {
            pedido = (Pedido) bundle.getSerializable("pedido");
        }

        if (pedido != null) {
            precoPedidoTela.setText(pedido.getValor());
        } else {
            precoPedidoTela.setText("Erro!");
        }

    }
}
