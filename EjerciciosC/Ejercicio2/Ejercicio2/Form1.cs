﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Ejercicio2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox1.Text = "";
            Lista.Items.Clear();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            String text = textBox1.Text;
            Lista.Items.Add(text);
            textBox1.Text = "";
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }
    }
}
