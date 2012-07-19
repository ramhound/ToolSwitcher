package com.sosmedia.toolswitcher;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class ClickListener implements Listener {

	@EventHandler
	public void getClickedBlock(PlayerInteractEvent event) {
		Block block = event.getClickedBlock();
		Action action = event.getAction();
		if(block instanceof Block && action == Action.LEFT_CLICK_BLOCK) {
			int blockId = event.getClickedBlock().getTypeId();
			PlayerInventory inv =event.getPlayer().getInventory();

			if(blockId == 2 || blockId == 3 || blockId == 82 || blockId == 13 || blockId == 110 || blockId == 12 || blockId == 88 || blockId == 80 || blockId == 78) {
				if(inv.contains(277)) {
					int slot = inv.first(277); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);
				} else if(inv.contains(256)) {
					int slot = inv.first(256); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);
				} else if(inv.contains(273)) {
					int slot = inv.first(273); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);
				} else if(inv.contains(284)) {
					int slot = inv.first(284); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);
				} else if(inv.contains(269)) {
					int slot = inv.first(269); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);
				}

			}
			if(blockId == 26 || blockId == 77 || blockId == 81 || blockId == 92 || blockId == 30 || blockId == 20 || blockId == 102 || blockId == 65 || 
					blockId == 69 || blockId == 103 || blockId == 328 || blockId == 29 || blockId == 33) {
				if(inv.contains(276)) {
					int slot = inv.first(276); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);
				} else if(inv.contains(283)) {
					int slot = inv.first(283); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);
				} else if(inv.contains(267)) {
					int slot = inv.first(267); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);
				} else if(inv.contains(272)) {
					int slot = inv.first(272); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);
				} else if(inv.contains(268)) {
					int slot = inv.first(268); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);
				} 
			}
			if(blockId == 96 || blockId == 64 || blockId == 54 || blockId == 85 || blockId == 58 || blockId == 107 || blockId == 84 || blockId == 17 || 
					blockId == 5 || blockId == 53 || blockId == 47 || blockId == 86 || blockId == 63 || blockId == 68 || blockId == 25 || blockId == 72 || 
					blockId == 99 || blockId == 100) {
				if(inv.contains(279)) {
					int slot = inv.first(279); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);
				} else if(inv.contains(286)) {
					int slot = inv.first(286); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);
				} else if(inv.contains(258)) {
					int slot = inv.first(258); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);
				} else if(inv.contains(275)) {
					int slot = inv.first(275); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);
				} else if(inv.contains(271)) {
					int slot = inv.first(271); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);
				}
			}
			if(blockId == 56 || blockId == 14 || blockId == 73 || blockId == 74 || blockId == 129 || blockId == 57 || blockId == 41) {
				if(inv.contains(278)) {
					int slot = inv.first(278); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);
				} else if(inv.contains(257)) {
					int slot = inv.first(257); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);
				}
			}
			if(blockId == 49) {
				if(inv.contains(278)) {
					int slot = inv.first(278); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);
				}
			}
			if(blockId == 16 || blockId == 15 || blockId == 21 || blockId == 4 || blockId == 121 || blockId == 48 || blockId == 24 || blockId == 1 || 
					blockId == 67 || blockId == 108 || blockId == 109 || blockId == 114 || blockId == 128 || blockId == 112 || blockId == 113 || blockId == 98 ||
					blockId == 45 || blockId == 87 || blockId == 43 || blockId == 44 || blockId == 101 || blockId == 71 || blockId == 52 || blockId == 23 ||
					blockId == 61 || blockId == 62 || blockId == 118 || blockId == 66 || blockId == 117 || blockId == 79 || blockId == 70) {
				if(inv.contains(278)) {
					int slot = inv.first(278); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);
				} else if(inv.contains(285)) {
					int slot = inv.first(285); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);
				} else if(inv.contains(257)) {
					int slot = inv.first(257); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);
				} else if(inv.contains(274)) {
					int slot = inv.first(274); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);
				} else if(inv.contains(270)) {
					int slot = inv.first(270); 					
					int currentSlot = inv.getHeldItemSlot(); 				
					ItemStack currentSlotItem = inv.getItem(currentSlot); 	
					ItemStack slotItem = inv.getItem(slot); 				
					inv.setItem(slot, currentSlotItem); 					
					inv.setItem(currentSlot, slotItem);

				}
			}

		}

	}
	@EventHandler
	public void damageEvent(EntityDamageByEntityEvent event) {
		if(event.getEntity() instanceof Player) {
			Player player = (Player) event.getEntity();
			PlayerInventory inv = player.getInventory();
			if(inv.contains(276)) {
				int slot = inv.first(276); 					
				int currentSlot = inv.getHeldItemSlot(); 				
				ItemStack currentSlotItem = inv.getItem(currentSlot); 	
				ItemStack slotItem = inv.getItem(slot); 				
				inv.setItem(slot, currentSlotItem); 					
				inv.setItem(currentSlot, slotItem);
			} else if(inv.contains(283)) {
				int slot = inv.first(283); 					
				int currentSlot = inv.getHeldItemSlot(); 				
				ItemStack currentSlotItem = inv.getItem(currentSlot); 	
				ItemStack slotItem = inv.getItem(slot); 				
				inv.setItem(slot, currentSlotItem); 					
				inv.setItem(currentSlot, slotItem);
			} else if(inv.contains(267)) {
				int slot = inv.first(267); 					
				int currentSlot = inv.getHeldItemSlot(); 				
				ItemStack currentSlotItem = inv.getItem(currentSlot); 	
				ItemStack slotItem = inv.getItem(slot); 				
				inv.setItem(slot, currentSlotItem); 					
				inv.setItem(currentSlot, slotItem);
			} else if(inv.contains(272)) {
				int slot = inv.first(272); 					
				int currentSlot = inv.getHeldItemSlot(); 				
				ItemStack currentSlotItem = inv.getItem(currentSlot); 	
				ItemStack slotItem = inv.getItem(slot); 				
				inv.setItem(slot, currentSlotItem); 					
				inv.setItem(currentSlot, slotItem);
			} else if(inv.contains(268)) {
				int slot = inv.first(268); 					
				int currentSlot = inv.getHeldItemSlot(); 				
				ItemStack currentSlotItem = inv.getItem(currentSlot); 	
				ItemStack slotItem = inv.getItem(slot); 				
				inv.setItem(slot, currentSlotItem); 					
				inv.setItem(currentSlot, slotItem);

			}
		}
	}

}
