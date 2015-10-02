#!/usr/bin/python
# -*- coding: utf-8 -*-

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "josrom"
__date__ = "$02-oct-2015 1:02:38$"

from gi.repository import Gtk

class Handler(Gtk.Window):
    def action_clicked(self, button):
        time = builder.get_object("time")
        time.set_text(button.get_label())

builder = Gtk.Builder()
builder.add_from_file("views/main.glade")
builder.connect_signals(Handler())

startButton = builder.get_object("buttonStart")
startButton.set_label("Start")

stopButton = builder.get_object("buttonStop")
stopButton.set_label("Stop")

resetButton = builder.get_object("buttonReset")
resetButton.set_label("Reset")

window = builder.get_object("window")

window.connect("delete-event", Gtk.main_quit)
window.show_all()
Gtk.main()