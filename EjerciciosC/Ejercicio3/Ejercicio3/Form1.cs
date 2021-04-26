using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Ejercicio3
{
    public partial class Form1 : Form
    {
        private int suma;
        public Form1()
        {
            InitializeComponent();
        }

        private void Limpiar_Click(object sender, EventArgs e)
        {
            suma = 0;
            textBox1.ResetText();
            Lista.Items.Clear();
        }

        private void Aceptar_Click(object sender, EventArgs e)
        {
            String text = textBox1.Text;
            Lista.Items.Add(text);
            if (textBox1.Text == "SUMAR")
            {
                Lista.Items.Add("Total de la suma: " + suma);
            }
            try
            {
                int i = Convert.ToInt32(text);
                suma += i; ;
            }
            catch (Exception w)
            {
                _ = w.StackTrace;
            }
            textBox1.ResetText();
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
    }
}
