#!/usr/bin/python
# -*- coding: utf-8 -*-

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "josrom"
__date__ = "$02-oct-2015 1:02:38$"

from gi.repository import Gtk

class cronometerWindow(Gtk.Window):
    def __init__(self):
        Gtk.Window.__init__(self, title = "Cronometer")
        Gtk.Window.set_default_size(self, 400, 275)
        Gtk.Window.set_position(self, Gtk.WindowPosition.CENTER)
        
        buttonStart = Gtk.Button("Start")
        buttonStart.connect("clicked", self.action)
        
        self.add(buttonStart)
    
    def action(self, button):
        print button
        
window = cronometerWindow()
window.connect("delete-event", Gtk.main_quit)
window.show_all()
Gtk.main()