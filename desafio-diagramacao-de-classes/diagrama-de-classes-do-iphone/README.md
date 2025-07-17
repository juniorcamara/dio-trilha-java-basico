classDiagram
    %% Interfaces
    class IReprodutorMusical {
      <<interface>>
      +tocar()
      +pausar()
      +selecionarMusica(música: String)
    }
    class IVideoPlayer {
      <<interface>>
      +reproduzir()
      +pausar()
      +selecionarVideo(video: String)
    }
    class ITelefone {
      <<interface>>
      +ligar(numero: String)
      +atender()
      +iniciarCorreioVoz()
      +acessarSMS()
      +enviarSMS(mensagem: String)
      +selecionarContato(contato: String)
      +editarContato(contato: String)
    }
    class IFotos {
      <<interface>>
      +acessarFotos()
    }
    class ICalendario {
      <<interface>>
      +acessarCalendario()
    }
    class INavegadorInternet {
      <<interface>>
      +acessarEmail()
      +enviarEmail(conteúdo: String)
      +acessarMaps()
      +acessarSafari(url: String)
      +abrirNovaAba()
      +fecharAba()
    }

    %% Main class
    class IPhone {
      -volume: int
      +tocar()
      +pausar()
      +selecionarMusica(m)
      +reproduzir()
      +pausarVideo()
      +selecionarVideo(v)
      +ligar(n)
      +atender()
      +iniciarCorreioVoz()
      +acessarSMS()
      +enviarSMS(msg)
      +selecionarContato(c)
      +editarContato(c)
      +acessarFotos()
      +acessarCalendario()
      +acessarEmail()
      +enviarEmail(conteúdo)
      +acessarMaps()
      +acessarSafari(url)
      +abrirNovaAba()
      +fecharAba()
      +aumentarVolume()
      +diminuirVolume()
    }

    %% Implementations
    IReprodutorMusical <|.. IPhone
    IVideoPlayer <|.. IPhone
    ITelefone <|.. IPhone
    IFotos <|.. IPhone
    ICalendario <|.. IPhone
    INavegadorInternet <|.. IPhone