class UserController {
  constructor() {
    this.users = [];
  }

  addUser(identidade, email, password, tipo, endereco, conta) {
    if (!identidade || !password) {
      throw new Error("Identidade, e password são obrigatórios");
    }

    const newUser = { identidade, email, password, tipo, endereco, account };
  }
}
