public class Main {
    public static void main(String[] args) {
        // Criando produtos
        Produto produto1 = new Produto(1, "Camiseta", 29.99);
        Produto produto2 = new Produto(2, "Calça", 49.99);

        // Criando clientes
        Cliente cliente1 = new Cliente(1, "João");
        Cliente cliente2 = new Cliente(2, "Maria");

        // Criando pedidos
        Pedido pedido1 = new Pedido(1, cliente1);
        pedido1.adicionarItem(produto1, 2);

        Pedido pedido2 = new Pedido(2, cliente2);
        pedido2.adicionarItem(produto2, 1);

        // Criando a loja
        Loja loja = new Loja();
        loja.adicionarProduto(produto1);
        loja.adicionarProduto(produto2);

        loja.adicionarCliente(cliente1);
        loja.adicionarCliente(cliente2);

        loja.adicionarPedido(pedido1);
        loja.adicionarPedido(pedido2);

        // Exibindo informações
        System.out.println("Produtos:");
        for (Produto produto : loja.getProdutos()) {
            System.out.println(produto.getId() + ": " + produto.getNome() + " - R$ " + produto.getPreco());
        }

        System.out.println("\nClientes:");
        for (Cliente cliente : loja.getClientes()) {
            System.out.println(cliente.getId() + ": " + cliente.getNome());
        }

        System.out.println("\nPedidos:");
        for (Pedido pedido : loja.getPedidos()) {
            System.out.println("Pedido " + pedido.getNumero() + " - Cliente: " + pedido.getCliente().getNome());
            for (ItemPedido item : pedido.getItens()) {
                System.out.println("  - " + item.getQuantidade() + "x " + item.getProduto().getNome());
            }
        }
    }
}
