using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace Practica5
{
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();
        }

        private async void Button_Clicked(object sender, EventArgs e)
        {
            string val1 = "Santiago";
            string val2 = "Yomilala";
            if (String.IsNullOrEmpty(Usuario.Text) || String.IsNullOrEmpty(Contrasena.Text))
            {
                await DisplayAlert("Error al llenar formulario", "Falta llenar un campo del formulario", "Aceptar");
                Usuario.Focus();
                Contrasena.Focus();
                return;
            }
            bool val3 = val1.Equals(Usuario.Text);
            bool val4 = val2.Equals(Contrasena.Text);
            if (val3==true && val4==true)
            {
                await Navigation.PushAsync(new FormLoginOk());
            }
            else {
                await Navigation.PushAsync(new FormLoginError());
            }
        }
    }
}
